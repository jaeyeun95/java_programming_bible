package overloading;

public class MyClass2Test {
    public static void main(String[] args) {
        MyClass2 my = new MyClass2();
        MyClass2 my2 = new MyClass2("아라치");
        MyClass2 my3 = new MyClass2("마루치", 46);
        MyClass2 my4 = new MyClass2(23, "오자바");

        System.out.println(my.getName()+"," + my.getAge());
        System.out.println(my2.getName()+"," + my2.getAge());
        System.out.println(my3.getName()+"," + my3.getAge());
        System.out.println(my4.getName()+"," + my4.getAge());
    }
    
}
