package com.example.Threadss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadpoolExample implements Runnable {
    public static void main(String[] args) {
    	ExecutorService service = Executors.newFixedThreadPool(10);
    	//ExecutorService service1 = Executors.newCachedThreadPool();
    	System.out.println("===hi==="+Thread.currentThread().getName());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	/*service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());

    	service.submit(new ThreadpoolExample());

    	service.submit(new ThreadpoolExample());

    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());
    	service.submit(new ThreadpoolExample());*/
    }
public void run(){
	for(int i=0;i<100;i++)
	System.out.println("===hi==="+Thread.currentThread().getName());
}
    
}
