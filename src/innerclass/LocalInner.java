package innerclass;

public class LocalInner {
    int a = 100; // 멤버변수
    public void innerTest(int k){
        int b = 200; // 지역변수
        final int c = k; // 상수
        // static int d = 300; // static변수는 사용 불가

        class Inner{
            public void getData(){
                System.out.println("int a : " + a);

                // Local 내부 클래스는 지역변수와 상수 모두 사용 가능
                System.out.println("int b : " + b);
                System.out.println("final itnc  : " + c); // 상수 사용
            }
        }   // 내부클래스 end
        Inner i = new Inner();  // 메서드 내에서 Local 내부 클래스 생성
        i.getData();    // 생성된 참조변수를 통해 메서드 호출
    } // 메서드 end
    public static void main(String[] args) {
        LocalInner outer = new LocalInner();
        outer.innerTest(1000);
    }
    
}
