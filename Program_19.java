// 19. Create a frame which displays your personal details with respect to a button click

import java.awt.*;
import java.awt.event.*;

public class Program_19 {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        Button b = new Button("Click Here");
        b.setBounds(450, 500, 100, 80);
        b.setFocusable(false);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              b.setVisible(false);
              Label txt1 = new Label("Oh!..My name is MR.GOD");
              Label txt2 = new Label("Studying  bca ");
              Label txt3 = new Label("Happy meating you");
              Label txt4 = new Label("this is just reference add more if u want");
              txt1.setBounds(420, 500, 200, 20);
              txt2.setBounds(420, 530, 200, 20);
              txt3.setBounds(420, 560, 200, 20);
              txt4.setBounds(420, 590, 200, 20);
              f.add(txt1);
              f.add(txt2);
              f.add(txt3);
              f.add(txt4);
            }
        });
        f.add(b);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

    }
}

// output:
// Run your applet