package chapter6.exceptionex;

import static java.lang.System.out;

public class ExceptionEx2 {
    public static void main(String[] args) {
            int[] var = {10,200,30};
            for (int i = 0; i <= 3; i++) {
                try {
                    // try 범위 내에 많은 수행문 중에서 예외가 발생한다면 발생 시점부터 같은 try범위 내의 마지막 
                    // 수행문까지 하나도 수행하지 못하고 catch문으로 넘어가게된다.
                    out.println((i+1) + "번쨰");
                    out.println("var[" + i +"] : " + var[i]);
                    out.println("~~~~~~~~~~~~~~~~~~~");   // 수행을 못하는 경우가 나올 수 있다.
                } catch (ArrayIndexOutOfBoundsException e) {
                    out.println("배열을 넣었습니다.");
                }
            }
    
            out.println("프로그램 끝");
    }
}
