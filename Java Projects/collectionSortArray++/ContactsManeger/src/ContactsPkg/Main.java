package ContactsPkg;

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

    public static void main(String[] str){
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
}
