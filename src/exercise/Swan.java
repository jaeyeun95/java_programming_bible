package exercise;

public class Swan extends Animal1 {

    public Swan(int age, String name, String gender) {
        super(age, name, gender);
    }

    public void printInfo(){
        System.out.println("하늘은 나는 "+ name +"입니다. 나이는 : " + age + "성별은 : " + gender);
    }
    // public void printInfo(int age, String name, String gender){
    //     System.out.println("하늘은 나는 "+ name +"입니다. 나이는 : " + age + "성별은 : " + gender);
    // }
    
    
}
