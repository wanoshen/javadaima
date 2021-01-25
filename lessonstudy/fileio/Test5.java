package lessonstudy.fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test5 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "皓皓浩";
        p.id = 123321;
        p.age = 15;

        Person pp = new Person();
        pp.name = "汪汪汪";
        pp.id = 33334444;
        pp.age = 22;

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("word.txt"));

            oos.writeObject(p);
            oos.writeObject(pp);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person p2 = null;
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("word.txt"));
            while (true) {
                p2 = (Person) ois.readObject();
                if (p2 == null) {
                    break;
                }
                p2.age=30;
                System.out.println(p2);
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
