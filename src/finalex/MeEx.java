package finalex;

class Me{
    int var = 100;
    public final void setVar(int var){
        this.var = var;
        System.out.println("abc"+this.var);
    }
}

public class MeEx extends Me{

    // final 메서드는 오버라이딩이 불가능하다.
    // public void setVar(int var){
    //     this.var = var;
    // }
    public MeEx(){
        super();
    }

    public static void main(String[] args) {
        MeEx me = new MeEx();
        me.setVar(1000);
    }
    
}
