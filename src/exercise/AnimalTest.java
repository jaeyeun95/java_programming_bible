package exercise;

public class AnimalTest {
    public static void main(String[] args) {
        
        // private boolean live;
        // private int age;
        // private String name;
        boolean live = true;
        int age = 3;
        String name = "큰뿔소";
        Animal animal = new Animal(true, 3, "큰뿔소");

        System.out.println(animal.showInfo(live, age, name));
        
        System.out.println("----------- 동물 변경 ---------------");
        
        name = "펭귄";
        System.out.println(animal.showInfo(live, age, name));
    }
    
}
