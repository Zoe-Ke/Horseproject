package com.tom;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HorseCanvas extends Canvas {
    List<Horses> hooo = new ArrayList<Horses>();
    Horses horse1;
    Horses horse2;
    Horses horse3;
    public HorseCanvas(){
        horse1 = new Horses(this);
        horse2 = new Horses(this);
        horse3 = new Horses(this);
        horse1.name = "(馬兒一號)";
        horse2.name = "(馬兒二號)";
        horse3.name = "(馬兒三號)";
        horse1.y=100;
        horse2.y=200;
        horse3.y=300;
        horse1.start();
        horse2.start();
        horse3.start();
        //hooo.add(horse1);
        //hooo.add(horse2);
        //hooo.add(horse3);
        /*try {
            horse1.join();
            horse2.join();
            horse3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */
        setBackground(Color.white);
    }
    @Override
    public void paint(Graphics g) {
        //f(每個東西拿出來的名字:集合OR迴圈)
        g.setColor(Color.red);//改變字的顏色
        g.drawLine(500,80,500,320);//終點線
        g.setColor(Color.pink);
        g.drawLine(5,150,490,150);//跑道
        g.drawLine(5,250,490,250);//跑道
        g.setColor(Color.orange);
        g.drawLine(5,350,600,350);
        g.setColor(Color.GRAY);//改變字的顏色
        g.drawString("比賽結果",100,375);
        g.setColor(Color.black);//改變字的顏色
        //g.setFont(new Font("Wingdings",Font.PLAIN,14));
        g.drawString("馬"+horse1.name, 1 + horse1.x1, horse1.y);
        g.drawString("馬"+horse2.name, 1 + horse2.x1, horse2.y);
        g.drawString("馬"+horse3.name, 1 + horse3.x1, horse3.y);
        String txt = "";
        if (hooo.size() > 0) {
            txt = "第一名:" + hooo.get(0).name + "   ";
        }
        if (hooo.size() > 1) {
            txt += "第二名:" + hooo.get(1).name + "   ";
        }
        if (hooo.size() > 2) {
            txt += "第三名:" + hooo.get(2).name + "   ";
        }
        g.drawString(txt, 20, 400);//名次顯示在視窗的位置
    }
}
