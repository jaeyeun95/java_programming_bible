package overloading;

public class MyClass2 {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private int age;

    public MyClass2(){
        name = "www.oracle.com";
    }
    public MyClass2(String n){
        name = n;
    }
    public MyClass2(String n, int a){
        age = a;
        name = n;
    }
    public MyClass2(int a, String n){
        age = a;
        name = n;
    }
    
}
