package chapter7.genericex;

import static java.lang.System.out;

public class GenericEx1<T> {    // 제너릭 타입을 적용한 클래스 선언

    T[] v;

    public void set(T[] n){
        v = n;
    }

    public void print(){
        for(T s : v)
        out.println(s);
    }
    
}
