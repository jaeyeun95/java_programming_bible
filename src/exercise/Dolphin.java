package exercise;

public class Dolphin extends Animal1 {

    public Dolphin(int age, String name, String gender) {
        super(age, name, gender);
    }

    public void printInfo(){
        System.out.println("수영을 잘하는 돌고래"+ name +"입니다.");
        System.out.println("나이는 : " + age + "성별은 : " + gender);
    }
    // public void printInfo(int age, String name, String gender){
    //     System.out.println("수영을 잘하는 돌고래"+ name +"입니다.");
    //     System.out.println("나이는 : " + age + "성별은 : " + gender);
    // }


    
    
}
