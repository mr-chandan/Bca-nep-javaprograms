// 23. Demonstrate the various mouse handling events using suitable example. 

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListenerExample implements MouseListener {
    // create two labels label1 and 1b12
    Label label1, label2;
    // create a frame frame
    Frame fr;
    // create a sing s
    String s;

    MouseListenerExample() {
        fr = new Frame("Java Mouse Listener Example");
        label1 = new Label("Demo for the Mouse Event", Label.CENTER);
        label2 = new Label();
        // set the layout of frame as Flowlayout
        fr.setLayout(new FlowLayout());
        // add label 1 to frame
        fr.add(label1);
        // add label 2 to frame
        fr.add(label2);
        // Register the created class MouseListenerExample with MouseListener
        fr.addMouseListener(this);
        // set the size of frame where width is 250 and height is 250
        fr.setSize(250, 250);
        // set the visibility of frame as true
        fr.setVisible(true);
    }

    // implementation of mouseClicked method
    public void mouseClicked(MouseEvent ev) {
        label2.setText("Mouse Button Clicked");
        fr.setVisible(true);
    }

    // implementation of mouseEntered method
    public void mouseEntered(MouseEvent ev) {
        label2.setText("Mouse has entered the area of window");
        fr.setVisible(true);
    }

    // implementation of mouseExited method
    public void mouseExited(MouseEvent ev) {
        label2.setText("Mouse has left the area of window");
        fr.setVisible(true);
    }

    // implementation of mousePressed method
    public void mousePressed(MouseEvent ev) {
        label2.setText("Mouse button is being pressed");
        fr.setVisible(true);
    }

    // implementation of mouseReleased method
    public void mouseReleased(MouseEvent ev) {
        label2.setText(" Mouse Released");
        fr.setVisible(true);
    }
    // main method
}

class Program_23 {
    public static void main(String args[]) {
        new MouseListenerExample();

    }

}
