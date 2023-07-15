package com.game;

import javax.swing.*;
import java.awt.*;

public class MyGame extends JFrame {
    MyGame(){
        System.out.println("Creating instant of game...");
        setTitle("My Tic Tac Toe Game...");
        setSize(850,850);
        ImageIcon icon=new ImageIcon("src/img/XOImage.png");
        setIconImage(icon.getImage());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
