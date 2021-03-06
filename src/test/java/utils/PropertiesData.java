package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesData {

    public static String getDataFromProperties(String fileName,String key)
    {
        String data=null;
        try{
            File src = new File ("./resource/"+fileName+".txt");
            FileInputStream fis = new FileInputStream(src);
            Properties pro = new Properties();
            pro.load(fis);
            data=pro.getProperty(key);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return data;
    }
    public static void writeDataInProperties(String fileName,String key,String value)
    {
        try{
            File src = new File("./appConfig/"+fileName+".properties");
            FileInputStream fis = new FileInputStream(src);
            Properties pro = new Properties();
            pro.load(fis);
            pro.setProperty(key, value);
            FileOutputStream fout = new FileOutputStream(src);
            pro.store(fout, "Edited property file stored");
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }
}
