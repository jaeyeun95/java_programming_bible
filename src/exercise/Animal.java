package exercise;

public class Animal {
    private boolean live;
    private int age;
    private String name;

    Animal(){}

    Animal(boolean live, int age, String name){
        this.live = live;
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public boolean getLive(Boolean live){
        return live;
    }

    public String showInfo(boolean live,  int age, String name){
        return "동물의 이름은 " + name + "이고 나이는 " + age + " live : " + live;

    }
    
}
