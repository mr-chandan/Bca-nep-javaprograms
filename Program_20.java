// 20. Create a simple applet which reveals the personal information of yours

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Program_20 extends Applet implements ActionListener {
    String s1 = "", s2 = "", s3 = "", s4 = " ", s5 = " ";

    public void init() {
        setLayout(null);
        setSize(400, 300);
        Button btn = new Button("CLICK HERE FOR MY PERSONAL DETAILS");
        add(btn);
        btn.setBounds(20, 50, 300, 30);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        s1 = "Full Name: Sreenivas Rao";
        s2 = "Father Name: Prabhakar Rao RL Mother Name: Kamalamma Age: 25";
        s3 = "Roll No : Bu16041976 College Name: Surana College";
        s4 = "Nationality: Indian Contact No: 9164591191";
        s5 = "Address: I main , Nagendra  Block, Bangalore-50";
        repaint();

    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.BOLD, 14));
        g.drawString(s1, 20, 110);
        g.drawString(s2, 20, 140);
        g.drawString(s3, 20, 180);
        g.drawString(s4, 20, 220);
        g.drawString(s5, 20, 260);
    }
}
/*
 * <applet code="Program_20.class" height=400 width=400> </applet>
 */
