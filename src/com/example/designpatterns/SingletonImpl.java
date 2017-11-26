package com.example.designpatterns;

 class SingletonEx implements  Runnable,Cloneable {
	
	private static volatile SingletonEx singleton;
	
	private SingletonEx(){
	
	}
	public static SingletonEx getInstance() {
			 if(singleton==null){
					synchronized(SingletonEx.class){
				         if(singleton==null){
					         singleton=new SingletonEx();
				         }
					}
			 }
		
		return singleton;
		// TODO Auto-generated method stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		getInstance();
	}
	
	public SingletonEx clone() throws CloneNotSupportedException{
		return getInstance();
		
	}
}
 public class SingletonImpl{
		 public static void main(String[] args) throws CloneNotSupportedException {
				// TODO Auto-generated method stub
			        SingletonEx singletonEx=SingletonEx.getInstance();
					System.out.println("---singletonImpl---"+singletonEx);
					singletonEx=SingletonEx.getInstance();
					System.out.println("---singletonEx---"+singletonEx);
					SingletonEx singletonEx1=(SingletonEx) singletonEx.clone();
					System.out.println("---singletonEx3---"+singletonEx1);

		}
 }