package utils;

import java.io.*;

public class TextUtility {

    public static PrintWriter pw = null;
    public static  FileWriter fw = null;

    public static File flat_file;

    public static void configFlatFile(String path){
        try {
            flat_file = new File(path);
            pw = new PrintWriter(flat_file);
            pw.write(" ");
        }catch (Exception e){
            System.out.println("Exception in setting up flat file: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public static void write_intoTextFile(String path,boolean value,String result) {
        try {
            fw = new FileWriter(flat_file,value);
            fw.write(result);
        }
        catch (Exception e)
        {
            System.out.println("Exception in writing into flat file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static String read_fromTextFile(String path){
        try{
            flat_file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(flat_file));
            String str=null;
            while((str = br.readLine()) != null){
                System.out.println(str);
                return str;
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
        return null;
    }

    public static void closeFile(){
        try {
            fw.close();
        }catch (Exception e){
            System.out.println("Exception in closing file: "+e.getMessage());
        }
    }

}
