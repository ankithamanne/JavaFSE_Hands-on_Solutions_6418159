class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int id, String name, double price) {
        orderId = id;
        customerName = name;
        totalPrice = price;
    }

    public String toString() {
        return orderId + " | " + customerName + " | " + totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, "Anu", 500.0),
            new Order(102, "Ravi", 300.0),
            new Order(103, "Meena", 700.0)
        };

        // Bubble Sort
        for (int i = 0; i < orders.length - 1; i++) {
            for (int j = 0; j < orders.length - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Orders by Total Price:");
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}
