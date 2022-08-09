package testPkg;

import java.io.FileWriter;

public class FileManager {
    public static void writeToFile(String text) throws Exception{
        if(text.length() == 0){
            throw new Exception("Empty string");

        }else{
            FileWriter fw = new FileWriter("test.txt");
            fw.write(text);
            fw.close();
        }
    }
}
