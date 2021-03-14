package com.company;

public class RunThread_2 implements Runnable{
    private String toSay;
    int sleep;
    public RunThread_2(String st,int sl){
        toSay = st;
        sleep=sl;
    }

    @Override
    public void run() {
        try {
            for(;;) {
                System.out.println(toSay);
                Thread.sleep(sleep);
            }
        }catch(InterruptedException e){
        }
    }

    public static void main(String [] args) {
        RunThread_2 out1 = new RunThread_2("Thread A",2000);
        RunThread_2 out2 = new RunThread_2("Thread B",1200);
        Thread thr1 = new Thread(out1);
        Thread thr2 = new Thread(out2);
        thr1.start();
        thr2.start();
    }

}
