package interfataButoane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameSec {

    private JFrame f2 = new JFrame("doi");
    private JButton buttonF2 = new JButton("Alege");
    private JLabel labelF2 = new JLabel("Ai ales unu");
    String[] petStrings = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};


    public JFrameSec() {
        f2.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));


        f2.setBackground(Color.MAGENTA);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setSize(500, 500);
        f2.setVisible(true);

        JComboBox petList = new JComboBox(petStrings);
        petList.setSelectedIndex(4);

        f2.add(petList);
        f2.add(labelF2);
        f2.add(buttonF2);

        petList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox cb = (JComboBox)e.getSource();
                buttonF2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(cb.getSelectedItem());

                    }
                });
            }
        });



    }


}