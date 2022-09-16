// 23. Demonstrate the various mouse handling events using suitable example. 

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListenerExample implements MouseListener {

    Label label1, label2;

    Frame fr;

    String s;

    MouseListenerExample() {
        fr = new Frame("Java Mouse Listener Example");
        label1 = new Label("Demo for the Mouse Event", Label.CENTER);
        label2 = new Label();

        fr.setLayout(new FlowLayout());

        fr.add(label1);
        
        fr.add(label2);
   
        fr.addMouseListener(this);
       
        fr.setSize(250, 250);
      
        fr.setVisible(true);
    }

 
    public void mouseClicked(MouseEvent ev) {
        label2.setText("Mouse Button Clicked");
        fr.setVisible(true);
    }

   
    public void mouseEntered(MouseEvent ev) {
        label2.setText("Mouse has entered the area of window");
        fr.setVisible(true);
    }

   
    public void mouseExited(MouseEvent ev) {
        label2.setText("Mouse has left the area of window");
        fr.setVisible(true);
    }

  
    public void mousePressed(MouseEvent ev) {
        label2.setText("Mouse button is being pressed");
        fr.setVisible(true);
    }

  
    public void mouseReleased(MouseEvent ev) {
        label2.setText(" Mouse Released");
        fr.setVisible(true);
    }
    
}

class Program_23 {
    public static void main(String args[]) {
        new MouseListenerExample();

    }

}
