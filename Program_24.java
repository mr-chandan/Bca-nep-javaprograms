// 24.Write a program to create menu bar and pull-down menus

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;

public class Program_24 {
    Program_24() {
        
        Frame f = new Frame("MENU AND MENUITEM");
        MenuBar mb = new MenuBar();

        Menu menu = new Menu("Menu");
        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("open");
        MenuItem i3 = new MenuItem("save");

        Menu menu1 = new Menu("Edit");
        MenuItem i4 = new MenuItem("Cut");
        MenuItem i5 = new MenuItem("Copy");
        MenuItem i6 = new MenuItem("Paste");

        Menu menu2 = new Menu("View");
        MenuItem i7 = new MenuItem("Font");
        MenuItem i8 = new MenuItem("Zoom in");
        MenuItem i9 = new MenuItem("Zoom out");

        mb.add(menu);
        mb.add(menu1);
        mb.add(menu2);

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);

        menu1.add(i4);
        menu1.add(i5);
        menu1.add(i6);

        menu2.add(i7);
        menu2.add(i8);
        menu2.add(i9);

        f.setMenuBar(mb);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String args[]) {
        Program_24 obj = new Program_24();
    }
}