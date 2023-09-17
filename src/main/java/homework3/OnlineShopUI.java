package homework3;
import homework3.exceptions.NullProductException;
import homework3.exceptions.NullQuantityException;

import java.util.InputMismatchException;
import java.util.Scanner;


    public class OnlineShopUI {
        public static void main(String[] args) {
            Product p1 = new Product("P1", 2,2);
            Product p2 = new Product("P2", 3,3);
            Product p3 = new Product("P3", 4,4);
            Product p4 = new Product("P4", 5,5);
            Product p5 = new Product("P5", 0,6);
            ProductDatabase dbMaster = new ProductDatabase();
            dbMaster.addProduct(p1);
            dbMaster.addProduct(p2);
            dbMaster.addProduct(p3);
            dbMaster.addProduct(p4);
            dbMaster.addProduct(p5);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            try {
                double totalPrice = ShopManager.purchaseProduct(productId,dbMaster);
                System.out.println("Total price: $" + totalPrice);
            } catch (NullQuantityException e){
                System.out.println(e.getMessage());
            }
            try {
                Product testProduct = dbMaster.getProduct(productId);
                System.out.println(testProduct);
            }catch (NullProductException e) {
                System.out.println(e.getMessage());
            }
        }
    }



