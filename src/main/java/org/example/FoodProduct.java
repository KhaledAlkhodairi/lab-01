package org.example;

import java.time.LocalDate;

public class FoodProduct extends Product{
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name,double weight, LocalDate expirationDate){
    super(id, price, name,weight);
    this.expirationDate = expirationDate;
  }


  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }

@Override
public void getSellableStatus() {
    // TODO Auto-generated method stub
    System.out.println("tish product is sellable");
}
}