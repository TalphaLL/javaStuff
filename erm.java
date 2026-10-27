import java.awt.event.KeyEvent;
public class erm
{
    String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";
    int x1 = 1, x2 = 2, x3 = 3;
    int y1 = 1, y2 = 2, y3 = 3;

    public void main(String[] args)
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n1 + " " + "|" + " " + n2 + " " + "|" + " " + n3 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n4 + " " + "|" + " " + n5 + " " + "|" + " " + n6 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n7 + " " + "|" + " " + n8 + " " + "|" + " " + n9 + " " + "|");
        System.out.println("|---|---|---|");
    }
    public void KeyPressed(KeyEvent e)
    {
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_UP:
                Location.x--;
                break;
            case KeyEvent.VK_DOWN:
                Location.x++;
                break;
            case KeyEvent.VK_LEFT:
                Location.y--;
                break;
            case KeyEvent.VK_RIGHT:
                Location.y++;
                break;
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
