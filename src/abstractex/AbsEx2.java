package abstractex;

abstract class AbsEx2 extends AbsEx1 {
    // AbsEx1 에서 상속받은 getA를 재정의해서 사용
    public int getA(){  
        return a;
    }

    public abstract String getStr();

    
}
