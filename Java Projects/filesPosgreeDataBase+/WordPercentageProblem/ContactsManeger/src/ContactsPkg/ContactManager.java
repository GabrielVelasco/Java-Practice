package ContactsPkg;

import java.util.ArrayList;

public class ContactManager {
    private int uuid;
    private ArrayList<Contact> familyList, friendsList, professionalList;

    public ContactManager(int randId){
        setUuid(randId);
        this.familyList = new ArrayList<Contact>();
        this.friendsList = new ArrayList<Contact>();
        this.professionalList = new ArrayList<Contact>();
    }

    public ContactManager(){
        setUuid(0);
        this.familyList = new ArrayList<Contact>();
        this.friendsList = new ArrayList<Contact>();
        this.professionalList = new ArrayList<Contact>();
    }

    public void addContactFamily(Contact contact){
        this.familyList.add(contact);
    }

    public void addContactFriend(Contact contact){
        this.friendsList.add(contact);
    }

    public void addContactProfessional(Contact contact){
        this.professionalList.add(contact);
    }

    public void deleteContact(String name) throws Exception{
        for(Contact c: this.familyList){
            if(c.getName().equals(name)){
                this.familyList.remove(c);
                return;
            }
        }

        for(Contact c: this.friendsList){
            if(c.getName().equals(name)){
                this.friendsList.remove(c);
                return;
            }
        }

        for(Contact c: this.professionalList){
            if(c.getName().equals(name)){
                this.professionalList.remove(c);
                return;
            }
        }

        throw new Exception("element not foud!");
    }

    public Object[] showFamilyLIst(){
        // returns array of contacts, user decides how to print
        Object[] tmp = this.familyList.toArray();
        return tmp;
    }

    public int getUuid() {
        return uuid;
    }

    private void setUuid(int uuid) {
        this.uuid = uuid;
    }
}
