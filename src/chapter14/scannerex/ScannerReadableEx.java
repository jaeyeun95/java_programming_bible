package chapter14.scannerex;

import java.io.*;
import java.util.*;

public class ScannerReadableEx {
    public static void main(String[] args) {
        Scanner sc = null;
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\test\\scan.txt");
            sc = new Scanner(fr);
            while (sc.hasNextDouble()){
                System.out.printf("스캔 double : %, 2f %n", sc.nextDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (sc != null) sc.close();
        }
    }
    
}
