package interfataButoane;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Interfata  {

    private JFrame frame = new JFrame("Main");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JLabel labelMain = new JLabel();


    public Interfata() {
        frame.setBackground(Color.CYAN);

        frame.getContentPane().setLayout(new GridLayout(2, 2));

        frame.add(labelMain);

        b1.addActionListener(new ActionListener() {
            JFrame frame= new JFrame();

            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new JFrameSec();
            }
        });


        b1.setBounds(20, 20, 100, 30);
        frame.add(b1);
        b2.setBounds(60,60,100,30);

        frame.add(b2);


        b2.addActionListener(new ActionListener() {
            JFrame f= new JFrame();
            public void actionPerformed(ActionEvent ae) {
                f.dispose();
                new JFrameThird();
            }
        });

        b2.setBounds(60,60,100,30);
        frame.add(b2);

        frame.setBackground(Color.CYAN);

        frame.setSize(500,500);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Interfata();
    }
}




