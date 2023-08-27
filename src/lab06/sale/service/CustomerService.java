package lab06.sale.service;

import lab06.sale.entities.Customer;
import lab06.sale.entities.FPTShop;
import lab06.sale.entities.Orders;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerService {
    public Map<Integer, Customer> getAllCustomer(FPTShop shop) {
        return shop.getCustomers();
    }
    public Customer getCustomerById(int idCus, ArrayList<Customer> customers) {
        //Customer customer = customers.stream().filter(e->e.getId() == idCus).collect(Collectors.toList()).get(0);
        return customers.get(idCus);
    }
    public void editCustomerInfo(int idCus, ArrayList<Customer> customers) {
        Customer customer = customers.get(idCus);
        System.out.println("Mời nhập thông tin chỉnh sửa....");
    }
}
