package ListManagerP;

import java.util.ArrayList;
import java.util.HashMap;

// hashMap<String(num telefone), Object>

public class ListManager implements ListManagerInterface{
    private HashMap<String, Object> myList;
    private int listSize;

    public ListManager(){
        this.myList = new HashMap<>();
    }

    public int getListSize() {
        return listSize;
    }

    public void addElement(String key, Object elem) throws Exception{
        if(myList.containsKey(key)){
            throw new Exception("Contact already exists!");
        }

        myList.put(key, elem);
    }

    public void removeElement(String phoneNumber) throws Exception{
        if(myList.containsKey(phoneNumber)) {
            myList.remove(phoneNumber);
            return;
        }

        throw new Exception("element not foud!");
    }

    public Object getElement(String phoneNumber) throws Exception{
        if(myList.containsKey(phoneNumber)){
            return myList.get(phoneNumber);

        }else{
            throw new Exception("Element not found");
        }
    }

    public Object[] toArray(){
        // returns array of 'element', user decides how to print, can't manipulate original list

        Object[] tmp = new Object[myList.size()];
        int i = 0;
        for(String key: myList.keySet()){
            tmp[i] = myList.get(key);
            i++;
        }

        return tmp;
    }

    public Object[] union(ListManager list1, ListManager list2){
        int size1 = list1.getListSize();
        int size2 = list2.getListSize();
        Object[] unionList = new Object[size2 + size1];

        Object[] arr1 = list1.toArray();
        Object[] arr2 = list2.toArray();

        int i = 0;
        for(Object o: arr1){
            unionList[i] = o;
            i ++;
        }

        for(Object o: arr2){
            unionList[i] = o;
            i ++;
        }

        return unionList;
    }

    public Object[] intersec(ListManager list1, ListManager list2){
        int size1 = list1.getListSize();
        int size2 = list2.getListSize();
        Object[] intersecList = new Object[size2 + size1];
        // confere os elem q se repetem

        return intersecList;
    }
}
