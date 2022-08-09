// Não vai dar tempo de fazer a GUI...

package ListManagerP;

import java.util.List;
import  java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static ListManager userContactList = new ListManager();

    public static void printList(Object[] list){
        // problema: printar 'list'(array de Contatc) por ordem de nome

        System.out.println("LIST: ");
        for(Object c: list){
            System.out.println(((Contact)c).toString());
        }
    }

    public static void printMenu(){
        System.out.println();
        System.out.println("1 - Carregar contatos");
        System.out.println("2 - Inserir contato");
        System.out.println("3 - Remover contato");
        System.out.println("4 - Buscar contato");
        System.out.println("5 - Imprimir lista contatos");
        System.out.println("0 - sair");
        System.out.print("Opcao: ");
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
                // line == "nome tel email" -> splited[0] == nome | splited[1] == tel ...
                String[] splited = lineFromFile.split("\\s+");
                String thisNome = splited[0];
                String thisTel = splited[1];
                String thisEmail = splited[2];

                // add to list
                inserirContato(thisNome, thisTel, thisEmail);
            }

        } catch (IOException var3) {
            System.out.println("Error: " + var3.toString());
        }

    }

    public static void writeLineToFile(String textToBeWritten, String writeFileName){
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

    public static void resetArq(String writeFileName){
        String filePath = "filesFolder/" + writeFileName;
        BufferedWriter writeObject = null;

        try {
            // instantiate writeObject
            writeObject = new BufferedWriter(new FileWriter(new File(filePath)));

            // write to file
            writeObject.write("");
            writeObject.flush();
            writeObject.close();

        }catch (java.io.IOException e){
            System.out.println("Error: " + e.toString());
        }
    }

    public static void inserirContato(String nome, String tel, String email){
        Contact c = new Contact(nome, tel, email);
        try{
            userContactList.addElement(tel, c);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void atualizaArq(){
        resetArq("contacts.txt");

        // copia list para arq.txt
        for(Object o: userContactList.toArray()){
            String text = ((Contact)o).toString() + "\n";

            writeLineToFile(text, "contacts.txt");
        }
    }

    public static void removerContato(ListManager list){
        System.out.println("Telefone a ser removido: ");
        String tel = sc.nextLine();

        try {
            list.removeElement(tel);
            atualizaArq();
            System.out.println("Removido!");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void buscaContato(ListManager list){
        System.out.println("Telefone a ser buscado: ");
        String tel = sc.nextLine();

        try {
            Contact returned = (Contact)list.getElement(tel);
            System.out.print("Contato retornado: ");
            System.out.println(returned.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] str){
        while(true){
            printMenu();
            int op = sc.nextInt(); sc.nextLine();
            if(op == 0)
                break;

            switch (op){
                case 1:
                    readFileAndCreateInstance("contacts.txt");
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    inserirContato(nome, tel, email);
                    String text = nome + " " + tel + " " + email + '\n';
                    writeLineToFile(text, "contacts.txt");
                    break;

                case 3:
                    removerContato(userContactList);
                    break;

                case 4:
                    buscaContato(userContactList);
                    break;

                case 5:
                    printList(userContactList.toArray());
                    break;

                default:
                    System.out.println("opcao invalida");
                    continue;
            }
        }

    }
}
