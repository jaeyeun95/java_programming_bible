package chapter13.readwrite;

import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\test\\fileWriter.txt");
            // fw = new FileWriter("D:\\test\fileWriter.txt", true);
            String message = "안녕하세요 FileWriter 테스트";
            fw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
