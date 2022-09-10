// 17. Write a program to create an applet and draw grid lines

import java.awt.*;
import java.applet.*;

public class Program_17 extends Applet {
    public void paint(Graphics G) {
        int i, j, x, y = 20;
        for (i = 1; i < 5; i++) {
            x = 20;
            for (j = 1; j < 5; j++) {
                G.drawRect(x, y, 40, 40);
                x = x + 20;
            }
            y = y + 20;

        }
    }
}
/*
 * <applet code ="Program_17.class" height= 500 width=500></applet>
 */
