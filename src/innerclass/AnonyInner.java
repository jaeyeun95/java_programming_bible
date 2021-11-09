package innerclass;

interface TestInner{
    int data = 10000;
    public void printData();
}

public class AnonyInner {
    
    public void test(){

        new TestInner() {
            public void printData(){    // 미완성된 것을 완성시킨다.
                System.out.println("data : " +data);
            }
        }.printData();
    }

    public static void main(String[] args) {
        AnonyInner ai = new AnonyInner();
        ai.test();
        // new AnonyInner().test();
    }
}
