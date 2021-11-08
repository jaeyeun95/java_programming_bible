package wrapper;

public class WrapperEx1 {
    public static void main(String[] args) {
        boolean b = true;
        Boolean wrap_b = new Boolean(b);
        System.out.println("문자열의 값 : " + wrap_b.toString());
        
    }
    
}
