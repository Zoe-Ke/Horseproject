package com.tom;

import javax.swing.*;
import java.awt.*;

public class HorseMain extends JFrame {
    public HorseMain(){
        setSize(600,500);
        HorseCanvas ho = new HorseCanvas();
        //JPanel jPanel= new JPanel();
        //JButton JB = new JButton("hi");
        //jPanel.add(JB);
        add(ho);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);//按視窗叉叉程式會跟著結束(要等幾秒)
    }
    public static void main(String[] args) {
        new HorseMain();
    }
}
