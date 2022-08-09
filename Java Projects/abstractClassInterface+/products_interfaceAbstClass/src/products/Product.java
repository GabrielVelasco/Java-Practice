package products;

public abstract class Product implements ProductInterface{
    private double price;
    // private String id, name, yearProduction ...

    public Product(double price){
        setPrice(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // getId(), getName() ...
}
