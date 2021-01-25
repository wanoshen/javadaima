package lessonstudy.fileio;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader( new FileReader("D:\\xunlei\\guwen.txt"));
            BufferedWriter writer = new BufferedWriter( new FileWriter("D:\\xunlei\\result.txt"));
            HashMap<String,String>map = new HashMap<>();
            String str;
            while(true){
                str = reader.readLine();
                if(str==null){
                    break;
                }else{
                    String[] a = str.split("\\.");
//                    int a0 = Integer.parseInt(a[0]);
                    map.put(a[0],a[1]);
                }
            }

            for(int i=1;i<=map.size();i++){
                String s2 = String.valueOf(i);
                System.out.println(i+"."+map.get(s2));
                writer.write(i+"."+map.get(s2));
                writer.write("\r\n");
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
