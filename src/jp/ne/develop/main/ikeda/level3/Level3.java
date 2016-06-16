package jp.ne.develop.main.ikeda.level3;

import java.util.HashMap;
import java.util.Map;


public class Level3 {
    public void execute(String val) throws Exception {
        Map<String, Integer> anserMap = getAnserMap(val);
        for (Map.Entry<String, Integer> e : anserMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    /**
     * 単語と出現回数のMapを返却する.
     * @param val 単語
     * @return anserMap
     * @throws Exception 引数がnull もしくは空文字の場合
     */
    public Map<String, Integer> getAnserMap(String val) throws Exception {
        if (val == null || val.length() == 0) {
            throw new Exception("引数が不正です。");
        }
        String[] splitArray = val.split(" ");
        Map<String, Integer> anserMap = new HashMap<>();
        for (String key : splitArray) {

            // 一致すればカウントアップ
            if (anserMap.containsKey(key)) {
                anserMap.put(key, anserMap.get(key) + 1);
            } else {
                anserMap.put(key, 1);
            }
        }
        return anserMap;
    }
}
