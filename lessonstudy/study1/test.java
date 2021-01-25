package lessonstudy.study1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        long start = System.currentTimeMillis();
        for(int i=0;i<30000000;i++){
            list.add(i+"");
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000);

    }
}


