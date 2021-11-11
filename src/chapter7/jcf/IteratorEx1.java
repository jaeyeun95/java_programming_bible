package chapter7.jcf;

import static java.lang.System.out;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>(2,5);

        v.add("구자철");
        v.add("손흥민");
        v.add("기성용");
        out.println("벡터크기 : " + v.size());

        Iterator<String> it = v.iterator(); // Iterator 얻기
        while(it.hasNext()){
            out.println(it.next());
            it.remove();    // 원본 컬렉션에서 요소 삭제
        }
        
        out.println("벡터 크기 : " + v.size());

    }
    
}
