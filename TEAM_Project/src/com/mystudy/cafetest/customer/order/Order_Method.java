package com.mystudy.cafetest.customer.order;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mystudy.cafetest.dao.CAFE_Sign_Modify_DAO;
import com.mystudy.cafetest.dao.CustomerDAO;
import com.mystudy.cafetest.dao.MenuDAO;
import com.mystudy.cafetest.dao.OrdersDAO;
import com.mystudy.cafetest.dao.OrdersdetailDAO;
import com.mystudy.cafetest.dao.SalesDAO;
import com.mystudy.cafetest.dao.StampDAO;
import com.mystudy.cafetest.manager.menu.ManagerMenu;
import com.mystudy.cafetest.vo.CartVO;
import com.mystudy.cafetest.vo.CustomerVO;
import com.mystudy.cafetest.vo.MenuVO;
import com.mystudy.cafetest.vo.OrdersVO;
import com.mystudy.cafetest.vo.OrdersdetailVO;
import com.mystudy.cafetest.vo.SalesVO;
import com.mystudy.cafetest.vo.StampVO;
import com.mystudy.cafetestcommon.CommonJDBCUtil;

public class Order_Method {
	static Scanner scan = new Scanner(System.in);
	static MenuDAO menuDao = new MenuDAO();
	static StampDAO stampDao = new StampDAO();
	static MenuVO menuvo = new MenuVO();
	static CartVO cartVo= new CartVO();
	static SalesVO salesVo = new SalesVO();
	static StampVO stampVo= new StampVO();
	static List<CartVO> cartlist = new ArrayList<>();
	static List<StampVO> stamplist = new ArrayList<>();
	static List<MenuVO> list = menuDao.selectAll(); // 메뉴판 표시할 때 VO 리스트에 담아서 데이터 가져옴
	static int selectMenuId =0;
	static int selectPrice = 0;
	static int selectCount = 0;
	static int totPrice = 0;
	static int inMoney = 0;
	static String pointNum = null;
	static int custId = 0;
	static int num = -1;
	static Connection conn = CommonJDBCUtil.getConnection();
	static SalesDAO saleDao = new SalesDAO();
	static ManagerMenu manager = new ManagerMenu();
	static CAFE_Sign_Modify_DAO smDao = new CAFE_Sign_Modify_DAO();
	static int change;
	
	static int orderId = OrdersDAO.selectCount();
	static int orderNum = OrdersDAO.selectCount();
	
	
	public static void startCafe () {
		
		runningCafe();
	}
	// 메인 메뉴 -------------------------------------
	public static void showMenu () {
		System.out.println("===================== Cafe =====================");
		System.out.println("[고객 - 1.주문하기 2.회원가입]\n"
				+ "[관리자 모드 - 3.주문 상세 조회 4.메뉴 관리 5.회원관리 0.종료]");
		System.out.println("================================================");
		
	}
	
	// 음료 메뉴판-----------------------------------
	public static void showCoffeeMenu () {

	System.out.println("======== 주문하기 ========");
	System.out.println("--------- Menu ---------");
	// 메뉴판 VO로 가져오기 
	for (MenuVO vo : list) {
		System.out.println(vo.getMenuId()+ ". " + vo.getName() + "\t" + vo.getPrice() + "원");
	}
	System.out.println("------------------------");
	
	}
	
	// 카페 운영 -----------------------------------
	public static void runningCafe () {
		boolean cafeStop = true;
	
		while (cafeStop) {
			// 메인 메뉴 표시
			showMenu();
			System.out.print(">> 메뉴 선택 : ");
			
			try {
				 num = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) { 
				// 숫자가 아닌 데이터(문자) 입력 시 예외 처리
				System.out.println("▶▷▶▷ 메뉴 숫자(1 ~ 5)만 입력하세요");
			}
			// 선택 작업
			switch (num) {
			case 0 :
				cafeStop = false;
                System.out.println("■ 카페 운영을 종료합니다");
                break;
            case 1:
                coffeeChoice();
                break;
            case 2:
                smDao.performSignUp(conn, scan);
                break;
            case 3:
                manager.selectManagerMenu4();
                break;
            case 4:
                manager.selectManagerMenu5();
                break;
            case 5:
            	
            	while (true) {
            		try {
            			System.out.println("1. 개별 고객 조회");
            			System.out.println("2. 전체 회원 조회");
            			System.out.println("0. 처음화면으로");
            			
            			System.out.print("□ 메뉴를 선택하세요 : ");
            		int subChoice = Integer.parseInt(scan.nextLine());
            		
            		if (subChoice < -1 || subChoice > 2) {
            			System.out.println("▶▷▶▷ 범위를 벗어난 값입니다. MENUID(1 ~ 2) 입력 가능");
            			continue;
            		} 
            		if (subChoice == 0) {
                      break; // 서브 메뉴 루프 종료
                  }
            			
            		if (subChoice == 1) {
            			smDao.retrieveAndUpdateUserInfo(conn, scan); // 개별 고객 조회
            		}
            		if (subChoice == 2) {
            			smDao.retrieveAllUsers(conn); // 전체 회원 조회
            		} else {
            			break;
            		}
            		} catch (NumberFormatException e) {
            			System.out.println("▶▷▶▷ 올바른 메뉴를 선택하세요.");
            		}
            	}
            	break;
               
			}

				
			}
		}

	
	
	// 커피 메뉴 선택 
	public static void coffeeChoice() {
		manager.showCoffeeMenu();
		boolean continueAdding = true;
		
		while (continueAdding) {
			System.out.println("□ 음료와 수량을 입력하세요");
			selectMenuId = manager.MenuIdContains();
			menuvo = menuDao.selectPrice(selectMenuId); // menuid로 가격 조회 
			selectPrice = menuvo.getPrice(); // 고른 메뉴 가격
			
			while (true) {
				try {
					System.out.print(">> 수량 : ");
				//selectCount = Integer.parseInt(scan.nextLine()); // 수량
					selectCount = Integer.parseInt(scan.nextLine());
					
					if (selectCount > 99) {
						System.out.println("▶▷▶▷ 최대 주문 수량은 99잔입니다.");
					} else {
						break;
					}
					
				} catch (NumberFormatException e) { 
					System.out.println("▶▷▶▷ 숫자만 입력하세요");
				} 
			}
			
			totPrice += (selectPrice * selectCount); // 가격 * 수량
			
			
			cartVo= new CartVO(menuvo.getName(),selectCount,selectPrice); // 장바구니 데이터 추가
			cartlist.add(cartVo); // cartVO  추가
//			System.out.println(cartVo.getTotcount()); // 장바구니에서 수량 확인 
			
			System.out.println("장바구니에 담겼습니다.");
			System.out.println("바로 결제 : 1 / 더 담으러 가기 : 2");
			
			while (true) {
				try {
					System.out.print(">> 메뉴 : ");
					
					int plusSelect = Integer.parseInt(scan.nextLine());
					
					if (plusSelect == 1) {
						// 포인트 적립 후 계산 
						System.out.println("포인트 적립을 진행합니다.");
						System.out.println("전화번호를 입력하세요 ex)010-1234-5678");
						
						
						while (true) {
							System.out.print(">> 전화번호 : ");
							pointNum = scan.nextLine(); 
							
							// 전화번호 형식 맞으면 true 리턴
							 Pattern pattern = Pattern.compile("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$");
							 Matcher matcher = pattern.matcher(pointNum);
							 
							 if (matcher.find()) {
				                    break; // 형식에 맞는 번호 입력 시 루프 종료
				                } else {
				                    System.out.println("▶▷▶▷ 올바른 전화번호 형식이 아닙니다. 다시 입력하세요.");
				                }
						 
						}
						
						// 전화번호에 해당하는 customerVO,custid 가져오기
						CustomerVO customerVo = CustomerDAO.selectCustId(pointNum);
						custId = customerVo.getCustid();
						//System.out.println("포인트 적립 예정 id : " + custId);
						
						StampDAO.update(pointNum, selectCount); // 포인트 적립 메소드 (pointNum, selectCount 때문에 메소드 안 나눔) 
						
						insertOrders(selectMenuId,selectCount,totPrice); // insert - orders,ordersdetail,sales
			
						// 스탬프 적립 후 보유 스탬프 확인하기 : 전화번호를 통해 stampvo에서 스탬프 개수 가져옴
						stampVo = StampDAO.selectStampCnt(pointNum);
						String stampId = stampVo.getStampId();
						int stampcnt = stampVo.getStampCnt();
						//System.out.println("스탬프 id : " + stampId);
						System.out.println("적립 후 보유 스탬프 : " + stampcnt);
						payment();
						continueAdding = false;
						}
					
					if (plusSelect == 2) {
						coffeeChoice();
						} 
					if (plusSelect > 2) {
						// 1,2가 아닌 숫자 입력 시
						System.out.println("▶▷▶▷ 바로결제 1, 더 담으러 가기 2 중 선택해주세요");
					} else {
						break;
					}
					
				} catch (NumberFormatException e) {
					System.out.println("▶▷▶▷ 숫자만 입력하세요");
				}
			
				
			} // while
			
			
			}
		}
	
	
	// 장바구니 출력 
	public static void printCart(List<CartVO> cartlist) {
		cartVo= new CartVO(menuvo.getName(),selectCount,selectPrice);
		System.out.println("===== 나의 장바구니 내역 ====="); 
		for (CartVO cartvo : cartlist) {
			System.out.println("음료 : " + cartvo.getMenuname()
								+ "  수량 : " + cartvo.getDrinkcount());
		} 
		System.out.println("■ 총 금액 : " + totPrice);
		System.out.println("=========================="); 
	}
	
	// 결제 메소드 
	public static void payment() {
		printCart(cartlist); // 장바구니 내역 출력 
		
		boolean continueLoop = true;
		
		System.out.println("■ 결제를 진행합니다.");
		
		
		 while (continueLoop) {
	         try {
	            System.out.print(">> 입금액 : ");
	            inMoney = Integer.parseInt(scan.nextLine());
	            // 잔액 = 입금액 - 총액
	            change = inMoney - totPrice; 
	            
	            if (change < 0) {
	               System.out.println("▶▷▶▷ 금액이 부족합니다. 다시 입력하세요");
	            } else if (change > 0) {
	               System.out.println("■ 잔액을 가져가세요");
	               System.out.println("잔액 : " + change);
	               System.out.println("■ 주문이 완료되었습니다.");
	            } else {
	               System.out.println("■ 주문이 완료되었습니다.");
	            }
	            
	            if (change >= 0) {
	               continueLoop = false;
	            }
	            
	         } catch (NumberFormatException e) {
	            System.out.println("▶▷▶▷ 문자입력불가.");
	            
	         }

	      }

		// 영수증 메소드 ---- 매개변수 : 입금액,잔액
		printReceipt(inMoney,change,totPrice);
		totPrice = 0;

		cartlist.clear();
		startCafe (); // 주문 완료 후 처음 메인화면으로 돌아감 
	}
	
	
	public static void insertOrders(int selectMenuId, int selectCount, int totPrice) { // insert - Orders,ordersdetail,sales
		OrdersVO ordersVo = new OrdersVO(++orderId, custId, totPrice);
		OrdersDAO.insert(ordersVo); 
	
		OrdersdetailVO ordersdetailVo = new OrdersdetailVO(selectMenuId,orderId,selectCount);
		OrdersdetailDAO.insert(ordersdetailVo);
		
		SalesVO salesVo = new SalesVO(++orderNum,orderId,selectCount, totPrice, "orderDate");
		saleDao.insert(salesVo);
		//System.out.println("insert 된 orderId : " + orderId + "insert 된 orderNum : " + orderNum);
		
	}
	
	
	// 영수증 출력
	public static void printReceipt (int inMoney, int change ,int totPrice) {
	
		System.out.println("\n[영수증]");
		salesVo = saleDao.selectOrderDate(orderNum);
		System.out.println(salesVo.getOrderDate()); // 주문 날짜 
		System.out.println("----------------------------");
		System.out.println("제품명\t\t수량\t가격");
		System.out.println("----------------------------");
		
		cartVo= new CartVO(menuvo.getName(),selectCount,selectPrice);
		for (CartVO cartvo : cartlist) {
			System.out.println(cartvo.getMenuname()
								+"\t\t" + cartvo.getDrinkcount()
								+"\t" + cartvo.getSelectPrice()*cartvo.getDrinkcount());
			} 
		System.out.println("■ 총 금액\t\t\t" + totPrice);
		
		System.out.println("----------------------------");
		System.out.println("결제 방법 : 현금");
		System.out.println("입금액 : " + inMoney); // 입금액 말고..
		System.out.println("잔액 : " + change);
		
		System.out.println("----------------------------");
	}
	

}
