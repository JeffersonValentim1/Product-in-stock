package entities;

public class Product {
    public  String name;
    public double price;
    public int quantity;
    // nomes de atributos e metodos em letras minusculas

    // Operações, funções ou methodos
  public double totalValueInStock(){
      return  price * quantity;

  }

  public  void addProducts(int quantity){
      this.quantity += quantity;
  }
  public  void  removeProducts (int quantity){
      this.quantity -= quantity;
  }

      public String toString(){
      return name
              + ", $ "
              + String.format("%.2f",price)
              + ", "
              + quantity
              + " units, Total: $ "
              + String.format("%,2f",totalValueInStock());

      }
      // sobreposição  do toString official




}
