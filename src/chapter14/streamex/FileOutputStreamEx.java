package chapter14.streamex;

import java.io.*;

import javax.annotation.processing.FilerException;

public class FileOutputStreamEx {
    public static void main(String[] args) throws FilerException, IOException {
        FileOutputStream fos = null;
        try {
            File f = new File("D:\\test");
            if(!f.exists())
            f.mkdirs();
            fos = new FileOutputStream("D:\\test\\fileout.txt");
            // fos = new FileOutputStream("D:\\test\\fileout.txt", true);   // true : 파일의 내용을 이어쓰기 하라는 의미
            String message = "Hello FileOutputStream()";
            fos.write(message.getBytes());
        } catch (FileNotFoundException ie) {
            ie.printStackTrace();
        } finally{
            try {
                if(fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
