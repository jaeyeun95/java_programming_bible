package chapter13.readwrite;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\test\\fileReader.txt");
            int readChar;
            while ( (readChar = fr.read()) != -1){
                System.out.print((char)readChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
