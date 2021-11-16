package chapter14.streamex;

import java.io.*;

public class PrintStreamEx {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        PrintStream ps = null;

        try {
            fos = new FileOutputStream("D:\\test\\printStream.txt");
            bos = new BufferedOutputStream(fos);
            ps = new PrintStream(bos, true);
            ps.println("성영한");
            ps.println(1234);
            ps.println(true);
            ps.println('a');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fos != null) fos.close();
                if(bos != null) bos.close();
                if(ps != null) ps.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
