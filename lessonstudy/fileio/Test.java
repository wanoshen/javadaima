package lessonstudy.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) {
        String pathname = "D:\\workspace\\test";
        File file1 = new File(pathname);
/*
        FileReader reader =null;
        FileWriter writer =null;
        try {
            reader = new FileReader("D:\\jdk-15.0.1_windows-x64_bin.zip");
            writer = new FileWriter("D:\\321\\jdk-15.0.1_windows-x64_bin.zip");

            int len;
            char[] chars = new char[1024];
            while(true){
                len = reader.read(chars);
                if(len==-1){
                    break;
                }
                writer.write(chars,0,len);
                writer.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }
*/


        a(file1);
//        System.out.println(b(10));

    }

    public static void a(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                a(f);
            } else {
                System.out.println(f);
            }
        }

    }

    public static long b(int num) {
        if (num <= 1) {
            return 1;
        }
        return b(num - 1) * num;
    }
}
