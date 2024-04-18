package org.example;

public class Product {
    private  String name;
    private  String description;
    private  float price;
    private int Quantity;
    private  float discount;
    private String color;
    public Product(Product product){
        this(product.name,product.description, product.price, product.Quantity, product.discount,product.color);

    }

    public Product(String name, String description, float price, int quantity, float discount) {
        this.name = name;
        this.description = description;
        this.price = price;
        Quantity = quantity;
        this.discount = discount;

    }

    public Product(String name, String description,float p, int quantity, float discount,String c) {
       this(name, description, p, quantity, discount);
       this.color=c;

    }
public Product(){

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", Quantity=" + Quantity +
                ", discount=" + discount +
                '}';
    }
}
