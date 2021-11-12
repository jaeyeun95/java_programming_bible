package chapter8.arraysex;

import java.util.Arrays;
import java.util.Vector;

public class AbleEx1 {
    public static void main(String[] args) {
        Vector<Able> v = new Vector<Able>(2,5);

        // Able 객체 생성 및 Vector에 추가
        Able a1 = new Able("B123", 90, 75, 70);
        Able a2 = new Able("T723", 60, 90, 80);
        Able a3 = new Able("A427", 85, 80, 80);
        Able a4 = new Able("6533", 90, 90, 60);
        v.addElement(a1);
        v.addElement(a2);
        v.addElement(a3);
        v.addElement(a4);

        System.out.println("-------------- Sort 전 ------------------");
        for(Able n : v){
            System.out.println(n.empno + ", " + n.getTotal());
        }
        
        Able[] a = new Able[v.size()];
        v.copyInto(a);
        AbleComp comp = new AbleComp();
        Arrays.sort(a, comp);
        System.out.println("--------------- Sort 후 --------------");
        
        for(Able n : v){
            System.out.println(n.empno + ", " + n.getTotal());
        }

        // binarySearch(이진검색) 에서는 반드시 정렬이 이루어진 상태이여야 한다.
        int index = Arrays.binarySearch(a, new Able(240), comp);
        System.out.println("240이 검색된 index : " + index);


    }
    
}
