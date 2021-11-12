package chapter8.propertiesex;

import static java.lang.System.out;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("UserName", "John"); // 속성 저장하기
        prop.setProperty("lovely ", "Hana");
        prop.setProperty("dbDRV", "oracle.jdbc.driver.OracleDriver");

        String user = prop.getProperty("UserName"); // 속성 가져오기
        String love = prop.getProperty("lovely");
        String db_drv = prop.getProperty("dbDRV");
        out.println(user);
        out.println(love);
        out.println(db_drv);

        out.println("------------- keys ------------------");
        // 키 값들만 얻어내기
        Enumeration keys = prop.propertyNames();
        while(keys.hasMoreElements())
            out.println(keys.nextElement());
        
        prop.list(System.out);


    }
    
}
