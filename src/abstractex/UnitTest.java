package abstractex;

public class UnitTest {
    public static void main(String[] args) {
        
        Zerg z1 = new Zerg("Hydralist", false);
        z1.decEnergy();
        System.out.println("저그의 에너지 : " + z1.getEnergy());
        
        Protoss p1 = new Protoss("Corsair", true);
        p1.decEnergy();
        System.out.println("프로토스의 에너지 : " + p1.getEnergy());

        Terran t1 = new Terran("Marine", false);
        t1.decEnergy();
        System.out.println("테란의 에너지 : " + t1.getEnergy());

    }
    
}
