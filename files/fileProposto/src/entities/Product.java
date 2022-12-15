package entities;

public class Product {

    private String name;
    private Double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double totalPrice(){
        return quantity*price;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", totalPrice());
    }
}
