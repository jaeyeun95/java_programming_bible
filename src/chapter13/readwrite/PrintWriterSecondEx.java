package chapter13.readwrite;

import java.io.*;

public class PrintWriterSecondEx {
    public static void main(String[] args) {
        PrintWriter pw = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream("D:\\test\\printWriterSecond.txt");
            bos = new BufferedOutputStream(fos);
            pw = new PrintWriter(bos, true);
            pw.println("안녕하세여!!");
            pw.println("또 만났네요.");
            pw.println(100.0);
            pw.println(false);
            // pw.println(new Boolean(true));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
                if (bos != null) bos.close();
                if (pw != null) pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
