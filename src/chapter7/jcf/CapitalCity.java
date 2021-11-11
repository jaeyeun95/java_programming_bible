package chapter7.jcf;

import java.util.HashMap;
import java.util.Scanner;

public class CapitalCity {
    // 수도 출력시키기
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<String,String>();

        map.put("대한민국", "서울");
        map.put("캐나다", "오타와");
        map.put("영국", "런던");
        map.put("스위스", "베른");
        
        System.out.println("--------------- 어떤 나라의 수도가 알고 싶으신가요? -------------------");
        System.out.println("1. 대한민국");
        System.out.println("2. 캐나다");
        System.out.println("3. 영국");
        System.out.println("4. 스위스");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println(map.get("대한민국"));
                break;
            case 2:
                System.out.println(map.get("캐나다"));
                break;
            case 3:
                System.out.println(map.get("영국"));
                break;
            default:
            System.out.println(map.get("스위스"));
            break;
        }

        sc.close();
    }
    
}
