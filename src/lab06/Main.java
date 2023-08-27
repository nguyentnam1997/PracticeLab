package lab06;

import lab06.sale.TableList;
import lab06.sale.entities.Product;
import lab06.sale.repositories.Singleton;

public class Main {
    public static void main(String[] args) {
        var a = Singleton.products;
        var pro = Singleton.products.stream().filter(x -> x.getName().equals("Product1")).findAny().orElse(new Product());
        pro.setName("BAU DUOI");
        Singleton.saveProduct(pro);

        TableList tl = new TableList(3, "ID", "NAME", "DES").sortBy(0).withUnicode(true);
// from a list
        a.forEach(element -> tl.addRow(String.valueOf(element.getId()), element.getName(), element.getDes()));
// or manually
        tl.print();
        System.out.println("abc");
    }
}
