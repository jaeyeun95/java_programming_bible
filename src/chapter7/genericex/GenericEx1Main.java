package chapter7.genericex;

public class GenericEx1Main {
    public static void main(String[] args) {
        GenericEx1<String> t = new GenericEx1<String>();

        String[] ss = {"애","아","서"};
        t.set(ss);
        t.print();

        // 안좋은 방법
        // GenericEx1 t1 = new GenericEx1();
        // Integer[] s = {1,2,3};
        // t1.set(s);
        // t1.print();

    }
    
}
