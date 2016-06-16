package jp.ne.develop.main.ikeda.level4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Level4 {
    public void execute(String[] student, int group) throws Exception {
        System.out.println("考え中,,,,,,");
        if (student == null || student.length == 0) { throw new Exception("生徒がいません"); }

        Map<String, List<String>> hogehoge = new LinkedHashMap<>(group);

        System.out.println("商"+ (student.length / group));
        System.out.println("あまり"+ (student.length % group));
        // 最小人数
        int minCount = student.length / group;
        // 余り人数
        int remainderCount = student.length % group;
        // 最大人数
        int maxCount =student.length / group == 0 ? student.length / group : (student.length / group + 1);

        List<String> hoge =new ArrayList<>();
        int count = 0;
        int teamCount = 1;
        for (String studentName : student) {
            System.out.println("配列中身"+studentName);
            hoge.add(studentName);
            if (hoge.size() == maxCount) {
                hogehoge.put("グループ" + teamCount, hoge);
                teamCount++;
            	
                hoge.clear();
            }
            count++;
        }


        for (Entry<String, List<String>> e :hogehoge.entrySet()) {
            System.out.println(e.getKey());
            for (String name : e.getValue()) {
                System.out.println(name);
            }
        }
    }
}
