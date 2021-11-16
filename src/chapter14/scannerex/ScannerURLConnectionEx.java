package chapter14.scannerex;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ScannerURLConnectionEx {
    public static void main(String[] args) {
        URLConnection urlCon = null;
        Scanner sc = null;
        try {
            urlCon = new URL("http://www.naver.com").openConnection();
            sc = new Scanner(urlCon.getInputStream());
            sc.useDelimiter("\\Z");
            String text = sc.next();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) sc.close();
        }
    }
}
