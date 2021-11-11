package chapter6.assertex;

import java.util.Arrays;

// p329 연습문제
public class Person {
    String name;
    String address;

    Person(){}
    
    public String getName(String name){
        return name;
    }

    public String getAddress(String address){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) throws Exception {
        
        // String[] strArr = {"1","2","3"};
        String[] strArr = {"1","2"};
        // String[] strArr = {"1"};

        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);

        // throw exception
        // if(strArr.length < 2){
        //     throw new Exception();
        // } else {
        //        System.out.println( strArr[0] + strArr[1]);
        // }

        // try ~ catch
        try {
            if(strArr.length < 2){
                throw new Exception();
            } else {
                System.out.println( strArr[0] + strArr[1]);
         }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
