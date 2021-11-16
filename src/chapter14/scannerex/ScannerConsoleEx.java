package chapter14.scannerex;

import java.util.*;

public class ScannerConsoleEx {
    public static void main(String[] args) {
        System.out.print("입력 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.printf("스킨 : %d", number);
        sc.close();
    }
    
}
