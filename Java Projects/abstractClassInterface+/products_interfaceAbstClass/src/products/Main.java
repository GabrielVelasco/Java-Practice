// cria classe manipulaLista { lista arr[], ..., add(), remove() ... }
package products;

public class Main {
    public void firstRunTest(){
        // create list
        myList list1 = new myList(5);

        // add objs
        list1.add(new Electronics(250.99));

        // get objs from list
        Product pReturned = list1.get(0);
        System.out.println(pReturned.getPrice());

        // visualizing pointer
        pReturned.setPrice(300);
        System.out.println(list1.get(0).getPrice());
    }

    public static void main(String[] args) {
        myList list = new myList(10);
        list.add(new Electronics(20.5));
        list.add(new Electronics(40.5));
        list.add(new Electronics(50.5));
        list.add(new Electronics(70.5));
        list.add(new Electronics(110.5));

        int size = list.size();
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum += list.get(i).getPrice();
            System.out.println("Price of: " + i + ": " + list.get(i).getPrice());
        }

        System.out.println(sum);
    }
}