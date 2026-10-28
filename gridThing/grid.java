package gridThing;

public class grid
{
    gridArray nums = new gridArray();

    void gridBuild()
    {
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + nums.coords[0][0] + " " + "|" + " " + nums.coords[0][1] + " " + "|" + " " + nums.coords[0][2] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + nums.coords[1][0] + " " + "|" + " " + nums.coords[1][1] + " " + "|" + " " + nums.coords[1][2] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + nums.coords[2][0] + " " + "|" + " " + nums.coords[2][1] + " " + "|" + " " + nums.coords[2][2] + " " + "|");
        System.out.println("|---|---|---|");
    }
}
class gridArray
{
    String[][] coords = { {"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"} };
    int row = 1;
    int col = 1;
    String pos = coords[row][col];
}
class xToGrid
{
    gridArray gridPos = new gridArray();
    int prevX, prevY;
    String prevNumber;
    void currentNumber()
    {
        prevNumber = gridPos.coords[prevY][prevX];
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
