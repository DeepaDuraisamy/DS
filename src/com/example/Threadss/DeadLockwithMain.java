package com.example.Threadss;

//a program to demonstrate deadlock
//using Main thread
public class DeadLockwithMain 
{
 public static void main(String[] args)
 {
     try
     {
          
         System.out.println("Entering into Deadlock");
         Thread.currentThread().join();
         System.out.println("Entering into Deadlock"+Thread.currentThread().getState());
         // the following statement will never execute
         System.out.println("This statement will never execute");
     } 
      
     catch (InterruptedException e) 
     {
         e.printStackTrace();
     }
 }
}