import java.util.HashMap;
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    Product(int id, String name, int qty, double pr) {
        productId = id;
        productName = name;
        quantity = qty;
        price = pr;
    }

    public String toString() {
        return productId + " | " + productName + " | " + quantity + " | " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Product> inventory = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        // Add product
        inventory.put(1, new Product(1, "Mouse", 50, 299.99));
        inventory.put(2, new Product(2, "Keyboard", 30, 699.99));

        // Update quantity
        if (inventory.containsKey(1)) {
            inventory.get(1).quantity = 45;
        }

        // Delete product
        inventory.remove(2);

        // Display inventory
        for (Product p : inventory.values()) {
            System.out.println(p);
        }

        sc.close();
    }
}
