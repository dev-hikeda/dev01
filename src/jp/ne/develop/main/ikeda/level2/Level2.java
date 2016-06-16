package jp.ne.develop.main.ikeda.level2;


public class Level2 {
    public void execute(int[] t) throws Exception {
        int count = 0;
        for (int i : t) {

            // 30%以下なら日数加算
            if (i <= 30) {
                count++;
            }
        }
        System.out.println("出かける日数：" + count + " 日です。");
    }
}
