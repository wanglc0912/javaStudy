package com.wlc.basicStudy;

public class CountOperate extends Thread {
    public CountOperate() {

    }

    @Override
    public void run() {
       super.run();
       for (int i = 0; i < 5000 ; i ++){
           System.out.println("i = " + (i + 1));
       }
    }
}
