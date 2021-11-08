package inheritance;

public class CellPhoneTest {
    public static void main(String[] args) {
        D_caPhone dca = new D_caPhone("IN-7600", "011-9xxx-9xxx", 60, "400만");

        MP3Phone mp = new MP3Phone("KN-600", "011-9xxx-9xxx", 60, 256);

        System.out.println(dca.getModel()+","+dca.getChord()+"," + dca.getNumber());
    }
    
}
