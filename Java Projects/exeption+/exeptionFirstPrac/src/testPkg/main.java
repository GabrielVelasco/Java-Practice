package testPkg;

import java.awt.desktop.SystemSleepEvent;
import java.io.File;

public class main {

    public static void tryToWrite() throws Exception{
        String textToWrite = "";
        FileManager.writeToFile(textToWrite);
    }

    public static void handleError(Exception e){
        System.out.println(e.getMessage());
    }

    public static void main(String argv[]){
        try {
            tryToWrite();
            System.out.println("Success!");
        }catch (Exception e){
            handleError(e);
        }
    }
}
