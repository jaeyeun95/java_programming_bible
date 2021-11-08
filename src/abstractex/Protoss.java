package abstractex;

public class Protoss extends Unit{
    boolean fly;
    public Protoss(String n, boolean b){
        name = n;
        energy = 100;
        fly = b;
    }
    @Override
    public void decEnergy() {
        energy --;
    }
    
}
