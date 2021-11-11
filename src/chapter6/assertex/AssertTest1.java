package chapter6.assertex;

public class AssertTest1 {
    public static void main(String[] args) {

        String str = "";
        assert str.length()> 0 : "시작시 인자값이 없습니다.";
        System.out.println(str);
        // assert var > 10;
        // assert var < 10 : "10보다 작은값이어야 함!";
        // assert str.equals(" ");
        // assert !str.equals(" ");
        // assert str != null : "str 에 null 값이 들어오면 안됨!";
    }
    
}
