package staticvariable;

public class BankMain {
    public static void main(String[] args) {
        
        Bank bk1 = new Bank("강남");
        Bank.interest = 0.2f;
        bk1.getInfo();

        System.out.println("--------------------------");

        Bank bk2 = new Bank("분당");
        bk2.getInfo();
    }
    
}
