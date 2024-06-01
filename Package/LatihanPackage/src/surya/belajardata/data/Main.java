package surya.belajardata.data;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Pantene", 25000);
        Product product2 = new Product("Sensodyne", 20000);
        Product product3 = new Product("CPU", 50000);
        Product product4 = new Product("GPU", 70000);

        System.out.println(product1.name);
        System.out.println(product2.name);

        ArrayList<Product> listProduct = new ArrayList<>();

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        System.out.println();
        System.out.println("ArrayList Product: ");
        for (Product product : listProduct) {
            System.out.println(product.name);
        }

        listProduct.remove(2);
        System.out.println();
        System.out.println("ArrayList setelah remove: ");
        for (Product product : listProduct) {
            System.out.println(product.name);
        }

        listProduct.set(0, product2);
        System.out.println();
        System.out.println("ArrayList setelah diubah: ");
        for (Product product : listProduct) {
            System.out.println(product.name);
        }
    }
}
