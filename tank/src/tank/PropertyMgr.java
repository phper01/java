package tank;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
    static Properties props=new Properties();


    private PropertyMgr(){}
    static {
        try {
            props.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config.yaml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object get(String key){
        if(props == null){
            return null;
        }
        return props.get(key);
    }

}
