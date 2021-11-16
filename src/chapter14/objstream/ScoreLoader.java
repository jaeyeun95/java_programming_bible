package chapter14.objstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
    private Rspinfo info;

    public Rspinfo getInfo(){
        return info;
    }

    public ScoreLoader(Rspinfo info){
        this.info = info;

        String path = "D:/RspScore/"+ info.getName().trim() + "/UserInfo.sav";
        File f1 = new File(path);

        if(f1.exists()){
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
                this.info = (Rspinfo)ois.readObject();

                if(ois != null)
                    ois.close();

                System.out.println("로드 성공");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("로드 실패");
            }
        }else {
            System.out.println("새로운 아이디 생성");
        }
    }

}
