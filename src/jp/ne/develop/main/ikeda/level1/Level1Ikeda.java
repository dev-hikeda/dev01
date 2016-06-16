package jp.ne.develop.main.ikeda.level1;



public class Level1Ikeda {

    public static final int  MIN_ANGLE = 1;
    public static final int  MAX_ANGLE = 180;

    public void execute(int a, int b) throws Exception {
        if (isCheckRangeAngle(a, b)) {
            System.out.println(MAX_ANGLE - (a + b));
        } else {
            throw new Exception("対象の三角形は存在しません");
        }
    }

    /**
     * 角度の範囲が妥当であるかチェックする.
     * @param angleA 角度A
     * @param angleB 角度B
     * @return 各角度が0度以下かつ180度以上である場合、2つの角度の和が2度以上179以下ではない場合にfalseを返す
     */
    public boolean isCheckRangeAngle(int angleA, int angleB) {
        int total = angleA + angleB;
        return (MIN_ANGLE  <= angleA  && angleA < MAX_ANGLE) &&
                (MIN_ANGLE  <= angleB  && angleB < MAX_ANGLE)  &&
                (MIN_ANGLE + 1 <= total && total <= MAX_ANGLE - 1);
    }
}
