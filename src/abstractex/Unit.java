package abstractex;

// 현재 클래스 내에 추상메서드가 하나라도 있다면 abstract 예약어를 사용해야함
abstract class Unit {   
    protected String name;
    protected int energy;
    abstract public void decEnergy();
    public int getEnergy(){
        return energy;
    }
    
}
