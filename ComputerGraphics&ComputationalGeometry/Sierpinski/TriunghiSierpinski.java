package TriunghiSierpinski;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TriunghiSierpinski extends JFrame {

    public static final int CANVAS_WIDTH = 1000;
    public static final int CANVAS_HEIGHT = 700;
    JButton next = new JButton("Next!");
    JButton prev = new JButton("Prev!");
    private DrawCanvas canvas;
    private JTextField jtfK = new JTextField("0", 5);
    private int k = 0;

    public TriunghiSierpinski() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        Container cp = getContentPane();
        cp.add(canvas);

        canvas.add(next);
        canvas.add(prev);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Desen Triunghi");
        setVisible(true);


        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (k >= 0 && k <= 2)
                    k += 1;
                canvas.setK(k);
                System.out.println(k);
                canvas.repaint();
            }
        });

        prev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (k > 0 && k <= 3)
                    k -= 1;
                canvas.setK(k);
                System.out.println(k);
                canvas.repaint();
            }
        });
    }

    private class DrawCanvas extends JPanel {
        private int k = 0;

        public void setK(int k) {
            this.k = k;
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.WHITE);
            g.setColor(Color.BLACK);

            g.drawString("1. Numar de iteratii: 3 ", 10, 20);
            g.drawString("2. Numar de triunghiuri: 27", 10, 40);

            Point p1 = new Point(250, 50);
            Point p2 = new Point(50, 450);
            Point p3 = new Point(450, 450);

            afisare(g, k, p1, p2, p3);

        }
    }

    private void afisare(Graphics g, int k, Point p1, Point p2, Point p3) {

        if (k == 0) {
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
            g.drawLine(p1.x, p1.y, p3.x, p3.y);
            g.drawLine(p2.x, p2.y, p3.x, p3.y);
        } else {
            Point p4 = mijloc(p1, p2);
            Point p5 = mijloc(p2, p3);
            Point p6 = mijloc(p3, p1);

            afisare(g, k - 1, p1, p4, p6);
            afisare(g, k - 1, p4, p2, p5);
            afisare(g, k - 1, p6, p5, p3);
        }

    }

    private Point mijloc(Point p1, Point p2) {
        Point point = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        return point;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TriunghiSierpinski();
            }
        });
    }
}