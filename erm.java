import java.awt.event.*;
import javax.swing.*;

public class erm
{
    static String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";
    static int x1 = 1, x2 = 2, x3 = 3;
    static int y1 = 1, y2 = 2, y3 = 3;

    public static void main(String[] args)
    {
        int currentPosX = x2;
        int currentPosY = y2;
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n1 + " " + "|" + " " + n2 + " " + "|" + " " + n3 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n4 + " " + "|" + " " + n5 + " " + "|" + " " + n6 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n7 + " " + "|" + " " + n8 + " " + "|" + " " + n9 + " " + "|");
        System.out.println("|---|---|---|");

    }
    public void Keypressed(KeyEvent e)
    {
      int c = e.getKeyCode();
      if (c == KeyEvent.VK_UP)
      {
        n2 = "x";
      }
    }
}
/*
11 12 13
21 22 23
31 32 33

n1 = x1, y1 | n2 = x1, y2 | n3 = x1, y3
n4 = x2, y1 | n5 = x2, y2 | n6 = x2, y3
n7 = x3, y1 | n8 = x3, y2 | n9 = x3, y3

|---|---|---|
| 1 | 2 | 3 |
|---|---|---|
| 4 | 5 | 6 |
|---|---|---|
| 7 | 8 | 9 |
|---|---|---|
*/
