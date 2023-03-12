package products;

public class myList implements myListInterface {
    private int size, maxLenght;
    private Product[] myList;

    public myList(int maxLenght){
        this.maxLenght = maxLenght;
        this.size = 0;
        this.myList = new Product[maxLenght];
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int getMaxLenght() {
        return maxLenght;
    }

    @Override
    public Product get(int index){
        return this.myList[index];
    }

    @Override
    public boolean add(Product p) {
        if(size() < getMaxLenght()){
            myList[size()] = p;
            this.size ++;
            return true;

        }else{
            return false;
        }
    }
}
