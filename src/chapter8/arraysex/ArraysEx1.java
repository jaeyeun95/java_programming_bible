package chapter8.arraysex;

import java.util.Arrays;

public class ArraysEx1 {
    public static void main(String[] args) {
        // 배열 채우기
        String[] ar = {"fill()", "in", "the", "Arrays"};

        Arrays. fill(ar, "Hana");
        for(String n : ar)
            System.out.print(n + ", ");
        
        System.out.println("\n-------------------------------");
        Arrays.fill(ar, 1, 3, "♥");
        for(String n : ar)
            System.out.print(n + ", ");


    }
    
}
