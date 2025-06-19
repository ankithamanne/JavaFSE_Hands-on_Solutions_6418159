public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(3, "Laptop", "Electronics"),
            new Product(1, "Shirt", "Apparel"),
            new Product(5, "Phone", "Electronics"),
            new Product(2, "Book", "Stationery")
        };

        // Linear Search
        Product foundLinear = SearchUtils.linearSearch(products, 5);
        if (foundLinear != null)
            System.out.println("Linear Search: Found " + foundLinear.productName);
        else
            System.out.println("Linear Search: Product not found");

        // Binary Search
        SearchUtils.sortProductsById(products);
        Product foundBinary = SearchUtils.binarySearch(products, 5);
        if (foundBinary != null)
            System.out.println("Binary Search: Found " + foundBinary.productName);
        else
            System.out.println("Binary Search: Product not found");
    }
}