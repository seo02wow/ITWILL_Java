package com.mystudy.thread4_error2_syncObj;

class Bank {
	int money = 0;
}

class ATM_Error extends Thread {
	Bank bank;
	
	public ATM_Error(Bank bank) {
		this.bank = bank;
	} 
	
	// 입금처리
	 void add(int money) {
		 synchronized (bank) { 
		bank.money += money;
		System.out.println(Thread.currentThread() + " - "
				+ "입금 : " + money + ", 잔액 : " + bank.money);
		 }
	}
	
	// 출금처리
	synchronized void out(int money) {
		synchronized (bank) {
		bank.money -= money;
		System.out.println(Thread.currentThread() + " - "
				+ "출금 : " + money + ", 잔액 : " + bank.money);
		}
	}
	
	@Override
	public void run() {
		add(1000);
		bankSleep(1000);
		out(500);
		bankSleep(1000);
		out(300);
		bankSleep(1000);
		out(200);
		
	} 
	
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}



public class ATM_Thread_Error_SyncObj {

	public static void main(String[] args) {
		System.out.println("=== main() 시작 ===");
		Bank bank = new Bank();
		
		ATM_Error atm1 = new ATM_Error(bank);
		ATM_Error atm2 = new ATM_Error(bank);
		
		atm1.start();
		atm2.start();
		
		System.out.println("=== main() 끝 ===");

	}

}
