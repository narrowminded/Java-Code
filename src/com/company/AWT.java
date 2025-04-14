package com.company;
import java.awt.*;
import java.awt.event.*;
public class AWT {
    public static void main(String[] args) {
        //Create new window
        Frame window = new Frame("My First Window");

        //Create a label and a window
        Label message = new Label("Hello");
        Button clickButton = new Button("Lick Me Daddy");

        //Put them in window
        message.setBounds(100,100,150,30);//position of label
        clickButton.setBounds(100,150,100,30);//position of button

        window.add(message);
        window.add(clickButton);

        //Set layout (we'll do it manually)
        window.setLayout(null);
        window.setSize(300,300);
        window.setVisible(true);

        //What happens when button is clicked?
        clickButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                message.setText("Now I am ready");
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
