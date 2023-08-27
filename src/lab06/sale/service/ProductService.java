package lab06.sale.service;

import lab06.sale.entities.Customer;
import lab06.sale.entities.FPTShop;
import lab06.sale.entities.Product;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    public Map<Integer, Product> getAllProduct(FPTShop shop) {
        return shop.getProducts();
    }
    public void addToCart(int productId, Scanner scanner, Map<Integer, Product> products, Customer customer) {
        Product product = products.get(productId);
        int quantity = inputQuantity(scanner, product.getQuantity());
        Product productCustomer = new Product(product, quantity);
        customer.getCart().getProducts().add(productCustomer);

    }
    private int inputQuantity(Scanner scanner, int productQuantity) {
        do {
            try {
                System.out.println("Mời nhập số lượng:");
                int quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0) {
                    System.out.println("Giá trị không hợp lệ, mời nhập lại!");
                }
                else {
                    if (quantity > productQuantity) {
                        System.out.println("Số lượng vượt quá số lượng trong kho, mời nhập lại");
                    }
                }
                return quantity;
            }
            catch (Exception e) {
                System.out.println("Giá trị không hợp lệ, mời nhập lại!");
            }
        }
        while (true);

    }
}
