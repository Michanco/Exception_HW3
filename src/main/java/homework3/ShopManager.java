package homework3;

import homework3.exceptions.NullProductException;
import homework3.exceptions.NullQuantityException;

public class ShopManager {
    public static Double purchaseProduct(int productId, ProductDatabase db) throws NullQuantityException{
        try {
            Product product = db.getProduct(productId);
            if (product.getAvailableQuantity() == 0)
                throw new NullQuantityException("Zero quantity product - " + product.getName());
            double totalPrice = product.getPrice() * product.getAvailableQuantity();
            return totalPrice;
        }catch (NullProductException e){
            System.out.println(e.getMessage());
        }return null;
    }
}
