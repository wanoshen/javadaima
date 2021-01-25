package lessonstudy.fileio;

import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int id;
    public int age;
    public void checek(){
        System.out.println("name: "+name+" id:"+id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
