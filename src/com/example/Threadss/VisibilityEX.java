package com.example.Threadss;


public class VisibilityEX {

    private static volatile boolean ready;

     

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {

            @Override

            public void run() {

                while (true) {
                    System.out.println("value of ready."+ready);

                    if (ready) {

                        System.out.println("Reader Thread - Flag change received. Finishing thread.");

                        break;

                    }

                }

            }

        }).start();

         

       // Thread.sleep(3000);

        System.out.println("Writer thread - Changing flag...");

        ready = true;

    }
}