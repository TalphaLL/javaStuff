package gridThing;

import java.util.Scanner;

class gridMove
{
    boolean o = true; //temp till I find a better way
    grid gridcode = new grid();

    void main(String[] args)
    {
        int[][] coords = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int row = 1;
        int col = 1;
        int pos = coords[row][col];
        gridcode.gridBuild();
        while (o)
        {
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            switch (move)
            {
                case "w":
                {
                    if (row != 0)
                    {
                        row--;
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
                    if (col != 0)
                    {
                        col--;
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
                    if (row != 2)
                    {
                        row++;
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
                    if (col != 2)
                    {
                        col++;
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
    c0  c1  c2
   |---|---|---|
r0 | 1 | 2 | 3 |
   |---|---|---|
r1 | 4 | 5 | 6 |
   |---|---|---|
r2 | 7 | 8 | 9 |
   |---|---|---|
*/
