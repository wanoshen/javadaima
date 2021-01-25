package lessonstudy.study1;

import java.util.*;


public class test1  {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("111",11);
        Student s2 = new Student("222",99);
        Student s3 = new Student("333",33);
        Student s4 = new Student("444",66);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        System.out.println(list);
 /*       ArrayList<Integer>arr = new ArrayList<>();
        arr.add(3);
        arr.add(33);
        arr.add(565);
        arr.add(232);
        arr.add(788);
        arr.add(5);
        Collections.sort(arr,(Integer a, Integer b)->{
            return b-a;
        });
        System.out.println(arr);*/
    }

}

