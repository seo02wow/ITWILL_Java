package com.mystudy.cafetest.vo;

public class CartVO {
	private String menuname;
	private int drinkcount;
	private int selectPrice;
	
	public CartVO() {}

	public CartVO(String menuname, int drinkcount, int selectPrice) {
		super();
		this.menuname = menuname;
		this.drinkcount = drinkcount;
		this.selectPrice = selectPrice;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public int getDrinkcount() {
		return drinkcount;
	}

	public void setDrinkcount(int drinkcount) {
		this.drinkcount = drinkcount;
	}

	public int getSelectPrice() {
		return selectPrice;
	}

	public void setSelectPrice(int selectPrice) {
		this.selectPrice = selectPrice;
	}

	@Override
	public String toString() {
		return "CartVO [menuname=" + menuname + ", drinkcount=" + drinkcount + ", selectPrice=" + selectPrice + "]";
	}
	
	
	
	
	
}
