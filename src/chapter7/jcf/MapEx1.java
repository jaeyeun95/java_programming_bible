package chapter7.jcf;
import static java.lang.System.out;

import java.util.HashMap;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        String[] msg = {"Berlin", "Dortmund", "Frankfurt", "Gelsenkirchen", "Hamburg"};

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for(int i = 0 ; i <msg.length; i++){
            map.put(i, msg[i]);
        }

        System.out.println("map :: " +map);

        out.println("test :: " + map.keySet());

        Set<Integer> keys = map.keySet();
        for(Integer n : keys)
            out.println(map.get(n));
    }
    
}
