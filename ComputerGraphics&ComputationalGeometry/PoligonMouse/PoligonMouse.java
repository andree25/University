package PoligonMouse;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import javax.swing.*;

public class PoligonMouse extends JFrame {

    private boolean desen;
    GeneralPath poligon = null;

    public static final int CANVAS_WIDTH = 600;
    public static final int CANVAS_HEIGHT = 600;

    private DrawCanvas canvas;


    public PoligonMouse() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        Container cp = getContentPane();
        cp.add(canvas);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Desen Mouse");
        setVisible(true);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                Point p = e.getPoint();

                if (!desen) {
                    poligon = new GeneralPath();
                    poligon.moveTo(p.x, p.y);
                    desen = true;
                } else {
                    poligon.lineTo(p.x, p.y);
                }
                repaint();
            }

        });


    }

    public class DrawCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            setBackground(Color.WHITE);
            g.setColor(Color.BLACK);

            if (poligon != null)
                g2d.draw(poligon);


        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PoligonMouse();
            }
        });
    }
}