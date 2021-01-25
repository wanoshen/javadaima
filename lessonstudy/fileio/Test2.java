package lessonstudy.fileio;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
/*            BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("word.txt"));
            writer.write("犯我中华");
            writer.flush();
            writer.write("\r\n");
            writer.write("虽远必诛");
            writer.flush();
            writer.close();*/

            BufferedReader reader = new BufferedReader(new FileReader("word.txt"));
            String len;
            while(true){
                len = reader.readLine();
                if(len==null){
                    break;
                }
                System.out.println(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
