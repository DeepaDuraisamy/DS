package com.example.Threadss;
class Account {
	 private int balance = 1000;
	 public int getBalance() {
	 return balance;
	 }
	 public void withdraw(int amount) {
	 balance = balance - amount;
	 }
	}
public class SynchornizationEXa {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		AccountThread accountThread=new AccountThread(account);
		accountThread.setName("john");
		accountThread.start();
		AccountThread accountThread1=new AccountThread(account);
		accountThread1.setName("leela");
		accountThread1.start();
		
		AccountThread accountThread2=new AccountThread(account);
		accountThread2.setName("Deepa");
		accountThread2.start();
		System.out.println(" State "+accountThread.getState());
		System.out.println(" State "+accountThread1.getState());
		System.out.println(" State "+accountThread2.getState());
		/*while(!accountThread.getState().equals("TERMINATED")){
			System.out.println(" balance "+account.getBalance());
		}*/
	     
		System.out.println("balance "+account.getBalance());
	}

}
class AccountThread extends Thread{
	private Account account;
	public AccountThread(Account account){
		this.account=account;
	}
	public void run(){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+" before  withdrawing");
				if(account.getBalance()>=600){
					System.out.println(Thread.currentThread().getName()+"   withdrawing");
					if(Thread.currentThread().getName().equals("john")){
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName()+" going to withdrwaing==");
					 account.withdraw(600);
					 
					 
					System.out.println("balance after "+Thread.currentThread().getName() +" withdrwaing"+account.getBalance());
				}
			}
	}
}