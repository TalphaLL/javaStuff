package gridThing;

public class grid
{
    public String n1 = "1", n2 = "2", n3 = "3", n4 = "4", n5 = "5", n6 = "6", n7 = "7", n8 = "8", n9 = "9";

    void gridBuild()
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n1 + " " + "|" + " " + n2 + " " + "|" + " " + n3 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n4 + " " + "|" + " " + n5 + " " + "|" + " " + n6 + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + n7 + " " + "|" + " " + n8 + " " + "|" + " " + n9 + " " + "|");
        System.out.println("|---|---|---|");
    }
}
class gridArray
{
    int[][] coords = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
    int row = 1;
    int col = 1;
    int pos = coords[row][col];
}
class xToGrid
{
    String gridPos;
    gridArray pos = new gridArray();
    grid num = new grid();
    int prevX, prevY;
    int currentX, currentY;
    void currentNumber()
    {
        if (pos.row == 0 && pos.col == 0 )
        {
            int tempY = pos.row, tempX = pos.col;
            gridPos = "1";
            num.n1 = "x";
        }
        if (pos.row == 1 && pos.col == 0);
        {

        }
    }
    void previousNumber()
    {
        if (prevX == 0 && prevY == 0)
        {
            num.n1 = "1";
        }
        if (prevX == 1 && prevY == 0)
        {

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
