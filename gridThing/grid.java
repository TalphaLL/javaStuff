package gridThing;

class grid
{
        MiscVariables pos = new MiscVariables();
        void gridBuild()
        {
            System.out.println("|---|---|---|");
            System.out.println("|" + " " + pos.n1 + " " + "|" + " " + pos.n2 + " " + "|" + " " + pos.n3 + " " + "|");
            System.out.println("|---|---|---|");
            System.out.println("|" + " " + pos.n4 + " " + "|" + " " + pos.n5 + " " + "|" + " " + pos.n6 + " " + "|");
            System.out.println("|---|---|---|");
            System.out.println("|" + " " + pos.n7 + " " + "|" + " " + pos.n8 + " " + "|" + " " + pos.n9 + " " + "|");
            System.out.println("|---|---|---|");
        }
}
