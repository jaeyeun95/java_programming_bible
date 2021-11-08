package abstractex;

public class Zerg  extends Unit{
    boolean fly;
    public Zerg(String n, boolean b){
        name = n ;
        energy = 100;
        fly = b;
    }
    @Override
    public void decEnergy() {
        energy -= 6;
    }
    
}
