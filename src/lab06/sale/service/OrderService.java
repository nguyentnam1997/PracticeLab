package lab06.sale.service;

import lab06.sale.entities.FPTShop;
import lab06.sale.entities.Orders;
import lab06.sale.entities.Product;

import java.util.ArrayList;
import java.util.Map;

public class OrderService {
    public Map<Integer, Orders> getAllOrder(FPTShop shop) {
        return shop.getOrders();
    }
    public void editOrder(int orderId, Map<Integer, Orders> orders) {
        Orders od = orders.get(orderId);
        System.out.println("Mời nhập....");
    }
}
