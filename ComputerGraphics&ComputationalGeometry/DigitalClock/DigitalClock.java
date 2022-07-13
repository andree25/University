package CeasDigi;

import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.SwingConstants;
import java.util.*;
import java.text.*;

public class CeasDigital {

    public static void main(String[] arguments) {

        Ceas dateLable = new Ceas("data");
        Ceas timeLable = new Ceas("timp");

        JFrame f = new JFrame("Ceas Digital");


        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3, 1));

        f.add(dateLable);
        f.add(timeLable);


        f.getContentPane().setBackground(Color.black);

        f.setVisible(true);

        JFrame.setDefaultLookAndFeelDecorated(true);

    }
}

class Ceas extends JLabel implements ActionListener {

    String type;
    SimpleDateFormat simpledt;

    public Ceas(String type) {
        this.type = type;
        setForeground(Color.white);

        switch (type) {
            case "data" : simpledt = new SimpleDateFormat("  MMMM dd yyyy");
                setFont(new Font("TimesRoman", Font.PLAIN, 15));
                setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "timp" : simpledt = new SimpleDateFormat("hh:mm:ss a");
                setFont(new Font("TimesRoman", Font.PLAIN, 50));
                setHorizontalAlignment(SwingConstants.CENTER);
                break;


        }

        Timer t = new Timer(1000, this);
        t.start();
    }

    public void actionPerformed(ActionEvent ae) {
        Date d = new Date();
        setText(simpledt.format(d));
    }
}