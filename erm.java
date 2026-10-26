import java.awt.event.*;
import javax.swing.*;

public class erm
{
    static String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";
    static int x1 = 1, x2 = 2, x3 = 3, x4 = 4, x5 = 5, x6 = 6, x7 = 7, x8 = 8, x9 = 9;
    static int y1 = 1, y2 = 2, y3 = 3, y4 = 4, y5 = 5, y6 = 6, y7 = 7, y8 = 8, y9 = 9;
    public static void main(String[] args)
    {
        int currentPosX = x5;
        int currentPosY = y5;
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



// |---|---|---|
// | 1 | 2 | 3 |
// |---|---|---|
// | 4 | 5 | 6 |
// |---|---|---|
// | 7 | 8 | 9 |
// |---|---|---|
