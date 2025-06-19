public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

class Main {
    public static int linearSearch(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == targetId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(Product[] products, int targetId) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return mid;
            } else if (products[mid].productId < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Sorted array for binary search
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(150, "Phone", "Accessories"),
            new Product(205, "Shoes", "Footwear"),
            new Product(300, "Watch", "Electronics")
        };

        int targetId = 150;

        int linIndex = linearSearch(products, targetId);
        if (linIndex != -1)
            System.out.println("Linear Search: Found " + products[linIndex].productName);
        else
            System.out.println("Linear Search: Not found");

        int binIndex = binarySearch(products, targetId);
        if (binIndex != -1)
            System.out.println("Binary Search: Found " + products[binIndex].productName);
        else
            System.out.println("Binary Search: Not found");
    }
}
