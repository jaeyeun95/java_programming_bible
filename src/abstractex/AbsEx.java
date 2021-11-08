package abstractex;

public class AbsEx extends AbsEx2 {

    @Override
    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        AbsEx ae = new AbsEx();
        System.out.println("ae.getA() : " +ae.getA());
        System.out.println("ae.getStr() : " +ae.getStr());

    }

    
}
