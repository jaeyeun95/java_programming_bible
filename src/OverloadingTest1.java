public class OverloadingTest1 {
    
    public void intLength(int a){
        String s = String.valueOf(a);
        getLength(s);
        // System.out.println("입력한 값의 길이 : " + s.length());
    }
    
    public void floatLength(float f){
        String s = String.valueOf(f);
        getLength(s);
        // System.out.println("입력한 값의 길이 : " + s.length());
    }
    
    public void stringLength(String str){
        getLength(str);
        // System.out.println("입력한 값의 길이 : " + str.length());
    }

    // 공통으로 있는 출력부분을 메소드로 
    public int getLength(String str){
        System.out.println("입력한 값의 길이 : " + str.length());
        return 0;
    }

    public static void main(String[] args) {
        OverloadingTest1 ot1 = new OverloadingTest1();

        ot1.intLength(1000);
        ot1.floatLength(3.14f);
        ot1.stringLength("100000");
    }
}
