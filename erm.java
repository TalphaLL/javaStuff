import java.awt.event.*;
import javax.swing.*;

public class erm
{
    public void main(String[] args)
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + vars.n1 + " " + "|" + " " + vars.n2 + " " + "|" + " " + vars.n3 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + vars.n4 + " " + "|" + " " + vars.n5 + " " + "|" + " " + vars.n6 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + vars.n7 + " " + "|" + " " + vars.n8 + " " + "|" + " " + vars.n9 + " " + "|");
        System.out.println("|---|---|---|");

    }
    public void Keypressed(KeyEvent e)
    {
      int c = e.getKeyCode();
      if (c == KeyEvent.VK_UP)
      {
        vars.n2 = "x";
      }
    }
    public class vars
    {
      String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";
      int x1 = 1, x2 = 2, x3 = 3, x4 = 4, x5 = 5, x6 = 6, x7 = 7, x8 = 8, x9 = 9;
      int y1 = 1, y2 = 2, y3 = 3, y4 = 4, y5 = 5, y6 = 6, y7 = 7, y8 = 8, y9 = 9;
      int currentPosX = x5;
      int currentPosY = y5;
    }
}



// |---|---|---|
// | 1 | 2 | 3 |
// |---|---|---|
// | 4 | 5 | 6 |
// |---|---|---|
// | 7 | 8 | 9 |
// |---|---|---|
