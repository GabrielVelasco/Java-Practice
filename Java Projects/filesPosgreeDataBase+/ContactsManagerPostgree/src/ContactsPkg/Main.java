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
        ContactManager userContactMng = new ContactManager();

        String url = "jdbc:postgresql://localhost:5432/contact-db";
        String user = "postgres";
        String password = "password123";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try{
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK!");

            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

        }catch (Exception e){
            System.out.println("Driver Error!!");
        }

        // goal: add a 'instance' to table 'contact'
        try {
            rs = stmt.executeQuery("INSERT INTO contact(name, sex, profession, phonenumber, email, age, contacttype)\n" +
                    "VALUES ('qwerqwer', 'male', 'zxcv', '92808574', 'email@email.com' ,24, 'family'); ");

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // goal: populate user's contact lists loading data from db
        try {
            String query = "select * from contact";
            rs = stmt.executeQuery(query);

            // rs == a line from the table
            // use rs.getString('column_name') to get the value from that line, column
            while (rs.next()){
                // for each line, create and add to the list
                String contactType = rs.getString("contacttype");
                if(contactType.equals("family")){
                    String name = rs.getString("name");
                    String sex = rs.getString("sex");
                    String profession = rs.getString("profession");
                    String phoneNumber = rs.getString("phonenumber");
                    String email = rs.getString("email");
                    int age = rs.getInt("age");


                    userContactMng.addContactFamily(new Contact(name, sex, profession, phoneNumber, email, age));
                }
            }

            printList(userContactMng.showFamilyLIst());

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
