package jp.ne.develop.main.ikeda.level3;


public class Main
{
    public static void main (String[] args) throws Exception
    {
        String val = "windows7 osx centos windows7 windows10 centos centos osx windows7 ubuntu windows7 osx";

        Level3 level3 = new Level3();
        level3.execute(val);
    }
}
