package chapter13.readwrite;

import java.io.*;

public class PrintWriterFirstEx {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("D:\\test\\printWriterFirst.txt");
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw, true);
            pw.println("안녕하세여");
            pw.println("반갑습니다.");
            pw.println(100);
            pw.print(new Integer("1000"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
                if (bw != null) bw.close();
                if (pw != null) pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
