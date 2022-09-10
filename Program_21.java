// 21. Write a program to move different shapes according to the arrow key pressed. 

import java.awt.*;
import java.awt.event.*;

class key extends Frame implements KeyListener {
    int x = 100;
    int y = 780;

    public void paint(Graphics g) {
        super.paint(g);
        Graphics shape = g.create();
        shape.setColor(Color.black);
        shape.drawRect(x, y, 100, 40);
        addKeyListener(this);
    }

    key() {

        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm')
            x++;
        repaint();
        if (e.getKeyChar() == 'N' || e.getKeyChar() == 'n')
            y++;
        repaint();
        // if (e.getKeyCode() == KeyEvent.VK_UP) {
        //     y++;
        // }
        // if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        //     y--;
        // }
        // if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        //     x++;
        // }
        // if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        //     x--;
        // }

    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

}

class program_21 {

    public static void main(String[] args) {
        new key();

    }
}
