package gridThing;

class grid
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
    public static String[][] coords = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"} };
    public static int row = 1;
    public static int col = 1;
    public String pos = coords[row][col];
}
class xToGrid
{
    int prevX, prevY;
    String prevNumber;
    boolean hasLastNum = false;
    void currentNumber()
    {
        if (hasLastNum)
        {
            gridArray.coords[prevY][prevX] = prevNumber;
        }
        prevNumber = gridArray.coords[gridArray.row][gridArray.col];
        gridArray.coords[gridArray.row][gridArray.col] = "x";
        prevY = gridArray.row;
        prevX = gridArray.col;
        hasLastNum = true;
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
