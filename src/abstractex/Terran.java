package abstractex;


public class Terran extends Unit{
    boolean fly;
    public Terran(String n, boolean b){
        name = n;
        energy = 100;
        fly =b;
    }

    @Override
    public void decEnergy() {
        energy -= 3;
    }
    
    
}
