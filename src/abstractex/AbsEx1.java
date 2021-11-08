package abstractex;

abstract class AbsEx1 {
    int a = 100; // 변수
    final String str = "abstract test"; // 상수
    public String getStr(){ // 일반 메서드
        System.out.println("str :: " + str);
        return str;
    }

    // 추상메서드는 body가 없음
    public abstract int getA();
}
