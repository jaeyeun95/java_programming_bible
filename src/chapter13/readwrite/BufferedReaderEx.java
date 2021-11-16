package chapter13.readwrite;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:\\test\\bufferReader.txt");
            br = new BufferedReader(fr);
            String msg;
            while( (msg = br.readLine()) != null){
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if (fr != null) fr.close();
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
