package gridThing;

import java.util.Scanner;

class Main
{
    static boolean o = true; //temp till I find a better way
    static void main()
    {
        grid.gridBuild();
        xToGrid rebuild = new xToGrid();
        IO.println("SEND ONE: W A S D");
        while (o)
        {
            Scanner input = new Scanner(System.in);
            String move = input.nextLine();
            switch (move)
            {
                case "w":
                {
                    if (gridArray.row != 0)
                    {
                        gridArray.row--;
                        rebuild.currentNumber();
                        grid.gridBuild();
                        IO.println("Moved Up");
                        break;
                    }
                    else
                    {
                        grid.gridBuild();
                        IO.println("You hit a wall");
                        break;
                    }
                }
                case "a":
                {
                    if (gridArray.col != 0)
                    {
                        gridArray.col--;
                        rebuild.currentNumber();
                        grid.gridBuild();
                        IO.println("Moved Left");
                        break;
                    }
                    else
                    {
                        grid.gridBuild();
                        IO.println("You hit a wall");
                        break;
                    }
                }
                case "s":
                {
                    if (gridArray.row != 2)
                    {
                        gridArray.row++;
                        rebuild.currentNumber();
                        grid.gridBuild();
                        IO.println("Moved Down");
                        break;
                    }
                    else
                    {
                        grid.gridBuild();
                        IO.println("You hit a wall");
                        break;
                    }
                }
                case "d":
                {
                    if (gridArray.col != 2)
                    {
                        gridArray.col++;
                        rebuild.currentNumber();
                        grid.gridBuild();
                        IO.println("Moved Right");
                        break;
                    }
                    else
                    {
                        grid.gridBuild();
                        IO.println("You hit a wall");
                        break;
                    }
                }
                default:
                {
                    IO.println("Wrong key");
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
