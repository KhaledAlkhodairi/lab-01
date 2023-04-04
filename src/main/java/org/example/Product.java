package org.example;

public abstract class Product {
    private int id;
    private double price;
    private String name;
    private double weight; 
   static private int quantity;

    public Product(int id, double price, String name,double weight){
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight=weight;
        quantity ++;
    }
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return quantity;
    }

    public abstract void getSellableStatus();

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
      if (weight<0){
throw new IllegalArgumentException("not accepted");
      }else{
          
          this.weight = weight;
      }
      
    }
    public static int getQuantity() {
        return quantity;
    }
    public static void setQuantity(int quantity) {
        Product.quantity = quantity;
    }
}
