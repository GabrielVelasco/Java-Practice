// Contacts Table on DB:
//      NAME, SEX, PROFESSION, PHONE_NUMBER, EMAIL, AGE, CONTACT_TYPE

// no inicio do programa ler dados do DB e para cada Linha da tabela instancia um Contact:
//      name = Linha.getString("NAME")
//      sex = Linha.getString("SEX")
//      profession = ...
//      ...
//      contactType = Linha.getString("CONTACT_TYPE")
//
//      if contactType == family
//          userContactMng.addContactFamily(name, sex, ..., age)
//      if contactType == friends
//          userContactMng.addContact....(...)
//      if contactType == profession
//          userContactMng.addContact....(...)

package ContactsPkg;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void printList(Object[] list){
        // problema: printar 'list'(array de Contatc) por ordem de nome

        // if (sortByName == true)
        Arrays.sort(list); // list == ArrayList -> Array

        System.out.println("LIST: ");
        for(Object c: list){
            System.out.println(((Contact)c).toString());
        }
    }

    public static void withOutDB(){
        ContactManager userContactMng = new ContactManager(1);

        // add contact do some list
        userContactMng.addContactFamily(new Contact("c", "male", "computer", "123456", "f1@e.com", 24));
        userContactMng.addContactFamily(new Contact("b", "male", "computer", "654321", "f2@e.com", 20));
        userContactMng.addContactFamily(new Contact("z", "male", "computer", "654321", "f2@e.com", 20));


        // show infos about a list
        printList(userContactMng.showFamilyLIst());

        // delete a contact
        try{
            userContactMng.deleteContact("f2");
            printList(userContactMng.showFamilyLIst());

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void withDB(){
        // tentei usar docker mas n funcionou :(

        String url = "jdbc:postgresql://localhost:5432/contactManager";
        String user = "postgres";
        String password = "candango";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK!");

        }catch (Exception e){
            System.out.println("Driver Error!!");
        }

        try {
            conn = DriverManager.getConnection(url, user, password);

            stmt = conn.createStatement();
            String query = "select * from contact";
            rs = stmt.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();

            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] str){
        withDB();
    }
}
