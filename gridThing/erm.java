package gridThing;

import java.util.Scanner;

class erm
{
    String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";
    int x1 = 1, x2 = 2, x3 = 3;
    int y1 = 1, y2 = 2, y3 = 3;
    boolean o = true;

    Location location = new Location();

    public void main(String[] args)
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n1 + " " + "|" + " " + n2 + " " + "|" + " " + n3 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n4 + " " + "|" + " " + n5 + " " + "|" + " " + n6 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n7 + " " + "|" + " " + n8 + " " + "|" + " " + n9 + " " + "|");
        System.out.println("|---|---|---|");
        while (o)
        {
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            switch (move)
            {
                case "w":
                {
                    if (location.x != 1)
                    {
                        location.x--;
                        System.out.println("Moved Up");
                        break;
                    }
                    else
                    {
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "a":
                {
                    if (location.y != 1)
                    {
                        location.y--;
                        System.out.println("Moved Left");
                        break;
                    }
                    else
                    {
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "s":
                {
                    if (location.x != 3)
                    {
                        location.x++;
                        System.out.println("Moved Down");
                        break;
                    }
                    else
                    {
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "d":
                {
                    if (location.y != 3)
                    {
                        location.y++;
                        System.out.println("Moved Right");
                        break;
                    }
                    else
                    {
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                default:
                {
                    break;
                }
            }
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
