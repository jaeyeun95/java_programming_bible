package chapter7.jcf;

import static java.lang.System.out;

import java.util.LinkedList;

public class QueueEx1 {
    public static void main(String[] args) {
        String[] item = {"소나타", "렉스톤", "제규어"};
        LinkedList<String> q = new LinkedList<String>();

        for(String n : item)
            q.offer(n);  // 요소 추가
        out.println("q의 크기 : " + q.size());

        String data = "";
        while( (data = q.poll()) != null)
            out.println(data + "삭제!");
        
        out.print("q의 크기 :" + q.size());
    }
    
}
