package jp.ne.develop.main.ikeda.level2;


public class Main
{
    public static void main (String[] args) throws Exception
    {
        int[] t = new int[7];
        t[0] = 100;
        t[1] = 31;
        t[2] = 28;
        t[3] = 10;
        t[4] = 70;
        t[5] = 40;
        t[6] = 0;

        Level2 level2 = new Level2();
        level2.execute(t);
    }
}
