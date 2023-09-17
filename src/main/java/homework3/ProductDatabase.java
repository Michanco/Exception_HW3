package homework3;

import homework3.exceptions.NullProductException;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {

    static List<Product> db = new ArrayList<>();

    public  void addProduct(Product product){
        db.add(product);
    }
    public  Product getProduct(int productId) throws NullProductException {
        // для упрощения в качестве ID используется порядковый номер в списке.
        if (productId > db.size()) throw new NullProductException("Invalid productID");
        return db.get(productId -1);
    }
}
