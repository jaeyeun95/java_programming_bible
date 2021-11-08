package finalex;

final class Me1{
    int var = 100;
    public void setVar(int var){
        this.var = var;
    }

    public int getVar(){
        return var;
    }
}

public class MeEx1 {
    // public void setVar(int var){
    //     this.var = var;
    // }   
    public static void main(String[] args) {
        Me1 me1 = new Me1();
        me1.setVar(1000);
        System.out.println(me1.getVar());
    }
}
