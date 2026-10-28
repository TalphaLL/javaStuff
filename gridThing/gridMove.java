package gridThing;

import java.util.Scanner;

class gridMove
{
    boolean o = true; //temp till I find a better way
    grid gridcode = new grid();

    void main(String[] args)
    {
        gridArray pos = new gridArray();
        gridcode.gridBuild();
        xToGrid rebuild = new xToGrid();
        System.out.println("SEND ONE: W A S D");
        while (o)
        {
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            switch (move)
            {
                case "w":
                {
                    if (pos.row != 0)
                    {
                        pos.row--;
                        rebuild.currentNumber();
                        gridcode.gridBuild();
                        System.out.println("Moved Up");
                        break;
                    }
                    else
                    {
                        gridcode.gridBuild();
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "a":
                {
                    if (pos.col != 0)
                    {
                        pos.col--;
                        rebuild.currentNumber();
                        gridcode.gridBuild();
                        System.out.println("Moved Left");
                        break;
                    }
                    else
                    {
                        gridcode.gridBuild();
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "s":
                {
                    if (pos.row != 2)
                    {
                        pos.row++;
                        rebuild.currentNumber();
                        gridcode.gridBuild();
                        System.out.println("Moved Down");
                        break;
                    }
                    else
                    {
                        gridcode.gridBuild();
                        System.out.println("You hit a wall");
                        break;
                    }
                }
                case "d":
                {
                    if (pos.col != 2)
                    {
                        pos.col++;
                        rebuild.currentNumber();
                        gridcode.gridBuild();
                        System.out.println("Moved Right");
                        break;
                    }
                    else
                    {
                        gridcode.gridBuild();
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
