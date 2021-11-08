package overridingEx;

class Parent{

    public Parent(int var){
        System.out.println("Parent 클래스");
    }

    public Parent(int var, int var2){
        System.out.println("인자 2개");
    }

}


public class SuperEx extends Parent{

    public SuperEx() {
        super(2,3);
        System.out.println("SuperEx 클래스");
    }
    
    public static void main(String[] args) {
        SuperEx se = new SuperEx();
    }
    
}
