package ArqPkg;

import java.io.*;

public class Main {
    public static void readFile(){
        // read a txt file, line by line

        String lineFromFile = null;
        BufferedReader readerObject = null;
        try {
            // instantiate readerObject
            readerObject = new BufferedReader(new FileReader(new File("filesFolder/arq.txt")));

            // read file
            while(true){
                lineFromFile = readerObject.readLine();
                if(lineFromFile == null)
                    break;

                System.out.println(lineFromFile);
            }

            readerObject.close(); // always remember to close the file...

        }catch (java.io.IOException e){
            System.out.println("Error: " + e.toString());
        }
    }

    public static void writeToFile(){
        String textToBeWritten = "this is a test xD";
        BufferedWriter writeObject = null;
        try {
            // instantiate writeObject
            writeObject = new BufferedWriter(new FileWriter(new File("filesFolder/arqWrite.txt")));

            // write to file
            writeObject.write(textToBeWritten);
            writeObject.flush();
            writeObject.close();

        }catch (java.io.IOException e){
            System.out.println("Error: " + e.toString());
        }
    }

    public static void main(String[] arg){
        readFile();
        writeToFile();
    }
}
