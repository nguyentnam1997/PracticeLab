package lab06.sale.repositories;

import lab06.sale.entities.Product;

import java.util.List;
import java.util.Objects;

public class Singleton {
    public static List<Product> products = new Product().Init();

    public static int saveProduct(Product product) {
        try {
            var p = products.stream().filter(x -> x.getId() == product.getId());
            if (Objects.equals(p, null)) {
                products.add(product);
            } else {
                products.set(products.indexOf(p), product);
            }
            return 0;
        } catch (Exception e) {
            return 1;
        }
    }
}
