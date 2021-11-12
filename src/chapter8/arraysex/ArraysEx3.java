package chapter8.arraysex;

import java.util.Arrays;

public class ArraysEx3 {
    public static void main(String[] args) {
        int[] ar1 = {20,3,12,1,5};

        Arrays.sort(ar1);
        for(int n : ar1)
            System.out.print(n + ", ");
    }
    
}
