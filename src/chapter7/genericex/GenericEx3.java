package chapter7.genericex;

import static java.lang.System.out;

public class GenericEx3<T> {

    T v;    // 멤버변수 선언

    public GenericEx3(){}

    public GenericEx3(T n){
        v = n;
    }
    public void set(T n){
        v = n;
    }
    public T get(){
        return v;
    }
    public static void main(String[] args) {
        GenericEx3<?> g3 = new GenericEx3<String>();
        // GenericEx3<?> g3 = new GenericEx3<String>("String 객체");    //생성자를 선언해서 해야한다
        // g3.set("String 객체");   // 오류
        String s = (String)g3.get();
        out.println("g2의 결과 : " + s);
    }
    
}
