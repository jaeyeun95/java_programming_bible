package objex;

public class ProductEx1 {
    public static void main(String[] args) {
        Product p1 = new Product("En, Ca", 7078);
        Product p2 = new Product("En, Ca", 7078);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        // p1, p2라고 출력해도 자동으로 toString() 메소드가 호출되어 name이라는
        // 멤버값이 출력된다.
        System.out.println("p1 hashCode : " +p1.hashCode() + ", p1" + p1);
        System.out.println("p2 hashCode : " +p2.hashCode() + ", p2" + p2);
    }
    
}
