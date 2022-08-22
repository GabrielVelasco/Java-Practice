// hashMap<String, int> == <palavra, qntdVezesQAparece>
// totalPalarvas = hashMap.size()

// pra cada Linha de 'arq.txt':
//      String[] splited = Linha.split(" ")
//      for Str in splited:
//          hashMap[Str] = +1

// percentPalavraN = hashMap[PalavraN] / totalPalavras
// pra cada Key(palavra) em hashMap:
//      percentPalavra = hashMap[Key] / totalPalavras
//      appendFile(Key, percentPalavra)

// pedir o kaio pra dar uma olhada na estrutura... (try/catch)...

package WordPercentPkg;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    // pde criar hashMap como atributo da classe Main??
    public static HashMap<String, Integer> mapPalavras = new HashMap<>();

    public static void createMapOfWordsFrom(String readFileName) throws java.io.IOException{
        // read a txt file, line by line, split line into array of strings and add to HashMap

        String filePath = "filesFolder/" + readFileName;
        String lineFromFile = null;
        BufferedReader readerObject = null;

        try {
            // instantiate readerObject
            readerObject = new BufferedReader(new FileReader(new File(filePath)));

            // read file
            while(true){
                lineFromFile = readerObject.readLine();
                if(lineFromFile == null)
                    break;

                String[] splited = lineFromFile.split("\\s+");
                for(String word: splited){
                    if(mapPalavras.containsKey(word)){
                        int newValue = mapPalavras.get(word) + 1;
                        mapPalavras.replace(word, newValue);

                    }else{
                        mapPalavras.put(word, 1);
                    }
                }
            }

            readerObject.close(); // always remember to close the file...

        }catch (java.io.IOException e){
            throw e;
        }
    }

    private static void writeToFile(String word, double value, String writeFileName) throws java.io.IOException{
        String textToBeWritten = word + ": " + Double.toString(value) + "\n";
        String filePath = "filesFolder/" + writeFileName;
        BufferedWriter writeObject = null;

        try {
            // instantiate writeObject
            writeObject = new BufferedWriter(new FileWriter(new File(filePath), true));

            // write to file
            writeObject.append(textToBeWritten);
            writeObject.flush();
            writeObject.close();

        }catch (java.io.IOException e){
            throw e;
        }
    }

    public static void calcPercetWordsAndWriteToFile(String fileName) throws java.io.IOException{
        for(String word: mapPalavras.keySet()){
            double percentValue = mapPalavras.get(word) / (double)mapPalavras.size();
            try {
                writeToFile(word, percentValue*100, fileName);
            }catch (java.io.IOException e){
                throw e;
            }
        }
    }

    public static void main(String[] args) {
        try{
            createMapOfWordsFrom("arq.txt");
            calcPercetWordsAndWriteToFile("out.txt");

        }catch (java.io.IOException e){
            System.out.println("Error: " + e.toString());
        }
    }
}
