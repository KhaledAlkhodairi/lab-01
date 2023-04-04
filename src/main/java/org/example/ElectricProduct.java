package org.example;

public class ElectricProduct extends Product{
    private String voltage;

    public ElectricProduct(int id, double price, String name,double weight, String voltage){
      super(id, price, name, weight);
      this.voltage = voltage;
    }
  
    @Override
    public String toString(){
      return super.toString() +"\t Voltage: " + this.voltage;
    }

    @Override
    public void getSellableStatus() {
        // TODO Auto-generated method stub
        System.out.println("tish product is sellable");
        
    }
}
