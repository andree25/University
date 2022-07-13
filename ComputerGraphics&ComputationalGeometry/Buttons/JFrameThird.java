package interfataButoane;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JFrameThird {

    private JFrame f3 = new JFrame("Ai ales 3");
    private JButton buttonF3 = new JButton("Alege");
    private JLabel labelF3 = new JLabel("Ai ales doi");
    String[] petStrings = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};

    public JFrameThird() {
        f3.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        f3.setBackground(Color.MAGENTA);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f3.setSize(500, 500);
        f3.setVisible(true);

        JList petList = new JList(petStrings);
        petList.setSelectedIndex(4);

        f3.add(petList);
        f3.add(labelF3);
        f3.add(buttonF3);

        petList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                buttonF3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(petList.getSelectedValue());

                    }
                });
            }
        });



    }


}
