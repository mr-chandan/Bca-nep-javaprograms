// 22. Write a java Program to create a window when we press M or m the window displays Good Morning,
// A or a the window displays Good After Noon E or e the window displays Good Evening, N or n the
// window displays Good Night 

import java.awt.*;
import java.awt.event.*;

class message extends Frame implements KeyListener {
    Label l = new Label();

    message() {
        addKeyListener(this);
        l.setBounds(200, 200, 200, 40);
        l.setFont(new Font("Calibri", Font.BOLD, 16));
        setSize(400, 400);
        add(l);
        setLayout(null);
        setVisible(true);

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyChar() == 'M' || e.getKeyChar() == 'm') 
        l.setText("GOOD MORNING");
        else if (e.getKeyChar() == 'A' ||e.getKeyChar() == 'a') 
        l.setText("GOOD AFTERNOON");
        else if (e.getKeyChar() == 'E' ||e.getKeyChar() == 'e') 
        l.setText("GOOD EVENING");
        else if (e.getKeyChar() == 'N' || e.getKeyChar() == 'n') 
        l.setText("GOOD NIGHT");
        
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new message();
    }
}
