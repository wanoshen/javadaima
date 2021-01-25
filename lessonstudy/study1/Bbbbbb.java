package lessonstudy.study1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.*;

public class Bbbbbb {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("123", "333");
        map.put("asd", "222");
        map.put("dsa", "777");
        map.put("lkj", "888");
        map.put("jkl", "999");

        Set<Entry<String, String>> set = map.entrySet();
        for (Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key + " value:" + value);
        }
        map.remove("jkl");
        System.out.println("========================");
        Set<String>keys = map.keySet();
        for(String k:keys){
            System.out.println("key:"+k+" value:"+map.get(k));
        }
        System.out.println("=======================");
        Iterator<String> it =keys.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(map.get(str));
        }
    }
}
