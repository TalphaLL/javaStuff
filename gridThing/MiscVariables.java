package gridThing;

class Numbers
{
    String[] nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
}
class grid
{
    void gridBuild()
    {
        Numbers numbs = new Numbers();
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + numbs.nums[0] + " " + "|" + " " + numbs.nums[1] + " " + "|" + " " + numbs.nums[2] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + numbs.nums[3] + " " + "|" + " " + numbs.nums[4] + " " + "|" + " " + numbs.nums[5] + " " + "|");
        System.out.println("|---|---|---|");
        System.out.println("|" + " " + numbs.nums[6] + " " + "|" + " " + numbs.nums[7] + " " + "|" + " " + numbs.nums[8] + " " + "|");
        System.out.println("|---|---|---|");
    }
}