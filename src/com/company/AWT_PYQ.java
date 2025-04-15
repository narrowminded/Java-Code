package com.company;
import java.awt.*;
import java.awt.event.*;
public class AWT_PYQ {
    public static void main(String[] args) {
        //Create new window
        Frame window = new Frame("My First Window");

        //Create a label and a window
//        Label message = new Label("Hello");
        Button clickButtonGreen = new Button("Green");
        Button clickButtonBlue = new Button("Blue");
        Button clickButtonRed = new Button("Red");

        //Put them in window
//        message.setBounds(100,100,150,30);//position of label
        clickButtonGreen.setBounds(50,150,100,30);//position of button
        clickButtonBlue.setBounds(250,150,100,30);//position of button
        clickButtonRed.setBounds(400,150,100,30);//position of button

//        window.add(message);
        window.add(clickButtonGreen);
        window.add(clickButtonRed);
        window.add(clickButtonBlue);

        //Set layout (we'll do it manually)
        window.setLayout(null);
        window.setSize(600,300);
        window.setVisible(true);

        //What happens when button is clicked?
        clickButtonGreen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setBackground(Color.GREEN);
            }
        });clickButtonRed.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setBackground(Color.RED);
            }
        });clickButtonBlue.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                window.setBackground(Color.BLUE);
            }
        });

        //Close the app when clicking the X
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
//                super.windowOpened(e);
                window.dispose();
            }
        });
    }
}
