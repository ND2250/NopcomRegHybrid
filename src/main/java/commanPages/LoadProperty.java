package commanPages;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperty {

    static Properties prop;
    static FileInputStream file;

    static String filelocation = "C:\\Users\\Nishant Dhanani\\IdeaProjects\\HybridNopcomReg1\\src\\test\\resources\\TestData\\Regconfig.properties";



    public String getProperty(String keyName){
        prop = new Properties();
        try {
            file = new FileInputStream(filelocation);
            prop.load(file);
            file.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        return prop.getProperty(keyName);

    }

}
