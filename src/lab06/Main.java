package lab06;

import lab06.sale.entities.Product;
import lab06.sale.repositories.Singleton;

public class Main {
    public static void main(String[] args) {
        var a = Singleton.products;
        var pro = Singleton.products.stream().filter(x -> x.getName().equals("Product1")).findAny().orElse(new Product());
        pro.setName("BAU DUOI");
        Singleton.saveProduct(pro);
        System.out.println("abc");
    }
}
