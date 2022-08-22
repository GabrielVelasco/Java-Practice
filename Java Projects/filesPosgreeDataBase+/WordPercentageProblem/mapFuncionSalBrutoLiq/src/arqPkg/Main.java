// hashMap <String, Funcionario> == <CPF, Funcionario>

// pra cada linha de 'salBruto.dat':
//      trata string "cpf salBruto", pega CPF e salBruto
//      add hashMap[CPF] = new Funcionario(CPF, salBruto)
//

// pra cada linha de 'descontos.dat':
//      trata string "cpf salBruto", pega CPF e valDesconto
//      salLiq = hashMap[CPF].calcSalLiquido(valDesconto)        // funcionario com este CPF ja esta instanciado
//      escreve no arq "salarioLiquido.txt": "CPF" + "salLiq"

package arqPkg;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static HashMap<String, Funcionario> mapFuncionarios = new HashMap<String, Funcionario>();

    public static void writeToFile(String cpf, double salLiquido, String writeFileName){
        String textToBeWritten = cpf + " " + Double.toString(salLiquido) + "\n";
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
            System.out.println("Error: " + e.toString());
        }
    }

    public static void readFileAndCreateInstance(String fileName) {
        String lineFromFile = null;
        String filePath = "filesFolder/" + fileName;
        BufferedReader readerObject = null;

        try {
            readerObject = new BufferedReader(new FileReader(new File(filePath)));

            while(true) {
                lineFromFile = readerObject.readLine();
                if (lineFromFile == null) {
                    readerObject.close();
                    break;
                }

                // split by 'space'
                // line == "CPF salBruto" -> splited[0] == cpf | splited[1] == salBruto
                String[] splited = lineFromFile.split("\\s+");
                String thisCpf = splited[0];
                double thisSalBruto = Double.parseDouble(splited[1]);

                // add to hashMap
                mapFuncionarios.put(thisCpf, new Funcionario(thisCpf, thisSalBruto));
            }

        } catch (IOException var3) {
            System.out.println("Error: " + var3.toString());
        }

    }

    public static void readFileAndCalcSalLiquido(String fileName) {
        // instances are already created

        String lineFromFile = null;
        String filePath = "filesFolder/" + fileName;
        BufferedReader readerObject = null;

        try {
            readerObject = new BufferedReader(new FileReader(new File(filePath)));

            while(true) {
                lineFromFile = readerObject.readLine();
                if (lineFromFile == null) {
                    readerObject.close();
                    break;
                }

                // split by 'space'
                // line == "CPF valDesc" -> splited[0] == cpf | splited[1] == valDesc
                String[] splited = lineFromFile.split("\\s+");
                String thisCpf = splited[0];
                double thisValDesc = Double.parseDouble(splited[1]);

                // calculate salLiq for this 'cpf' and write to file
                double salLiquido = mapFuncionarios.get(thisCpf).calcSalLiquido(thisValDesc);
                writeToFile(thisCpf, salLiquido, "salarioLiquido.txt");
            }

        } catch (IOException var3) {
            System.out.println("Error: " + var3.toString());
        }

    }

    public static void main(String[] arg){
        readFileAndCreateInstance("salarioBruto.dat");
        readFileAndCalcSalLiquido("desc.dat");
    }
}
