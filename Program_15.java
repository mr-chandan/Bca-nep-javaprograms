// 15. Write a program which create and displays a message on the window 

import java.awt.*;

class frame {
    frame() {
        Frame gg = new Frame();
        gg.setTitle("My First Frame");
        Label lb = new Label("Hi,who are you");
        lb.setBounds(250, 250, 100, 100);
        gg.add(lb);
        gg.setSize(500, 500);
        gg.setVisible(true);
    }
}

class Program_15 {
    public static void main(String args[]) {
        frame f1 = new frame();
    }
}
