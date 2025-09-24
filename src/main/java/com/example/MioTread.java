package com.example;




public class MioTread extends Thread{

        private int n;
        public MioTread(int contatore){
        n=contatore;
        }

    public void run(){
        for(int i=0;i<n;i++){
            System.out.println(Thread.currentThread().getName()+";"+i);
        }
    }
}
