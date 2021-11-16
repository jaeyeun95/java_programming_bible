package chapter14.scannerex;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SacnnerFileEx {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("D:\\test\\scan.txt"));
            while(sc.hasNextDouble()){
                System.out.printf("스캔 double :  %, 2f %n", sc.nextDouble() );
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) sc.close();
        }
    }
    
}
