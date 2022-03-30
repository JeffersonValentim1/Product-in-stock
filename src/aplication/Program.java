package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public  static  void  main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        //System.out.println(product.name + "," + product.price + "," + product.quantity);//
        System.out.println();
        System.out.println("Product data: " + product);

        // enter date in stcok
        System.out.println();
        System.out.print("Enter the number prodcut to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        // remove data in stock
        System.out.println();
        System.out.print("Enter the number prodcut to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity); // quantity a ser removida

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
