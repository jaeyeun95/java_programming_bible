package chapter14.streamex;

import java.io.*;

public class BufferOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            fos = new FileOutputStream("D:\\test\\bufferOut.txt");
            bos = new BufferedOutputStream(fos);
            String str = "BufferedOutputStream Test 입니다.";
            bos.write(str.getBytes());
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
                if (bos != null) bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
