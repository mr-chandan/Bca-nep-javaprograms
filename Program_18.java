// 18. Write a program which creates a frame with two buttons father and
// mother. When we click the father button the name of the father, his age and designation must appear.
// When we click mother similar details of mother also appear.

import java.awt.*;
import java.awt.event.*;

public class Program_18 {
    public static void main(String[] args) {
        Frame f = new Frame("Program_18");
        Button father = new Button("Father");
        Button mother = new Button("mother");
        father.setBounds(300, 500, 100, 80);
        father.setFocusable(false);
        mother.setBounds(600, 500, 100, 80);
        mother.setFocusable(false);

        father.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Label txt1 = new Label("Name : Ramu");
                Label txt2 = new Label("Age : 51 ");
                Label txt3 = new Label("Dedignation : CEO");
                txt1.setBounds(300, 300, 200, 20);
                txt2.setBounds(300, 330, 200, 20);
                txt3.setBounds(300, 360, 200, 20);
                f.add(txt1);
                f.add(txt2);
                f.add(txt3);
            }
        });

        mother.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Label txt1 = new Label("Name : Somu");
                Label txt2 = new Label("Age : 46 ");
                Label txt3 = new Label("Dedignation : CEO");
                txt1.setBounds(600, 300, 200, 20);
                txt2.setBounds(600, 330, 200, 20);
                txt3.setBounds(600, 360, 200, 20);
                f.add(txt1);
                f.add(txt2);
                f.add(txt3);
            }
        });

        f.add(father);
        f.add(mother);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

    }
}

// output:
// Run your applet
