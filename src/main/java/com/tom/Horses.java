package com.tom;

import java.util.Random;
import javax.swing.*;

public class Horses extends Thread{
    Random random = new Random();//設定亂數
    int x1 = 0;
    //int x2 = random.nextInt(500);//x方向是一個500的變數
    //int x3 = random.nextInt(500);//x方向是一個600的變數
    int y = 0;//Y方向是一個500的變數
    String name="";
    HorseCanvas parent;
    public Horses(HorseCanvas parent) {
        this.parent = parent;
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (x1 < 500) {
                int dir1 = random.nextInt(10) + 2;
                // int dir2 = random.nextInt(3);
                //int dir3 = random.nextInt(3);
                x1 = x1 + dir1;
                if (x1 >= 500){
                    x1 = 500;
                    parent.hooo.add(this);
                }
                //x2=x2+dir2;
                //x3=x3+dir3;
                parent.repaint();
            }else{
                interrupt();
            }
            //System.out.println(getName());
            try {
                sleep(120);
                //System.out.println(getName()+"到達終點");
            } catch (InterruptedException e) {
                e.printStackTrace();
                // System.out.println(getName()+"跌倒");
            }
        }
    }
}
