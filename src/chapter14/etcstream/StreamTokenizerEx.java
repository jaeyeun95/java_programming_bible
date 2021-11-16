package chapter14.etcstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class StreamTokenizerEx {
    public static void main(String[] args) {
        BufferedReader br = null;
        StreamTokenizer st = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("D:\\test\\streamToken.txt");
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw,true);
            pw.println(10000);
            pw.println("안녕하세요");
            pw.println("jyh@korea.com");
            pw.println("I am a boy");
            pw.println("~'!@#");
            br = new BufferedReader(new FileReader("D:\\test\\streamToken.txt"));
            st = new StreamTokenizer(br);
            while( st.nextToken() != StreamTokenizer.TT_EOF){
                switch (st.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word => " +st.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("NUMBER => " + (int)st.nval);
                        break;
                    default:
                        System.out.println("No word, No number => " + (char)st.ttype);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
                if (bw != null) bw.close();
                if (pw != null) pw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
}
