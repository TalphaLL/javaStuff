package gridThing;

import java.util.Scanner;

class gridMove
{
    boolean o = true; //temp till I find a better way
    MiscVariables pos = new MiscVariables();
    grid gridcode = new grid();

    void main(String[] args)
    {
        gridcode.gridBuild();
        while (o)
        {
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            switch (move)
            {
                case "w":
                {
                    if (pos.x != 1)
                    {
                        pos.x--;
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
                    if (pos.y != 1)
                    {
                        pos.y--;
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
                    if (pos.x != 3)
                    {
                        pos.x++;
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
                    if (pos.y != 3)
                    {
                        pos.y++;
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
                    System.out.println("Wrong key");
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
