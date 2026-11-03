package gridThing;

public class grid
{
    static void gridBuild()
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + gridArray.coords[0][0] + " " + "|" + " " + gridArray.coords[0][1] + " " + "|" + " " + gridArray.coords[0][2] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + gridArray.coords[1][0] + " " + "|" + " " + gridArray.coords[1][1] + " " + "|" + " " + gridArray.coords[1][2] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + gridArray.coords[2][0] + " " + "|" + " " + gridArray.coords[2][1] + " " + "|" + " " + gridArray.coords[2][2] + " " + "|");
        System.out.println("|---|---|---|");
    }
}
class gridArray
{
    static public String[][] coords = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"} };
    public int row = 1;
    public int col = 1;
    public String pos = coords[row][col];
}
class xToGrid
{
    gridArray gridPos = new gridArray();
    int prevX, prevY;
    String prevNumber;
    void currentNumber()
    {
        if (prevX != 0 || prevY != 0)
        {
            prevNumber = gridPos.coords[prevY][prevX];
        }
        gridPos.coords[gridPos.row][gridPos.col] = "x";
        prevY = gridPos.row;
        prevX = gridPos.col;
        prevNumber = gridPos.coords[prevY][prevX];
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
