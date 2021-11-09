package enumex;

public class EnumEx3 {
    public enum Item{
        Add(5), Del(11), Search(2), Cancel(22);
        private final int var;  // 실제 상수값을 저장하는 메모리 공간

        Item(int v){ // 생성자
            var = v;
        }

        public int getVar(){
            return var;
        }
    }

    public static void main(String[] args) {
        
        for(Item n: Item.values()){
            System.out.println(n + " : " + n.getVar());
        }
    }
    
}
