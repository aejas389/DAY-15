import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) {
        this.quantity -= amount;
    }

    @Override
    public String toString() {
        return name + " - Price: " + price + ", Quantity: " + quantity;
    }
}

class DMart {
    private List<Product> products;

    public DMart() {
        products = new ArrayList<>();
        // Adding some initial products
        products.add(new Product("Milk", 1.50, 100));
        products.add(new Product("Bread", 0.80, 50));
        products.add(new Product("Eggs", 2.00, 200));
        products.add(new Product("Cheese", 3.00, 30));
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void purchaseProduct(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                if (product.getQuantity() >= quantity) {
                    product.reduceQuantity(quantity);
                    System.out.println("Purchased " + quantity + " of " + productName + ". Total cost: " + (product.getPrice() * quantity));
                    return;
                } else {
                    System.out.println("Insufficient quantity for " + productName + ". Available: " + product.getQuantity());
                    return;
                }
            }
        }
        System.out.println("Product not found: " + productName);
    }
}

public class DMartApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DMart dMart = new DMart();
        String command;

        System.out.println("Welcome to D-Mart!");

        do {
            System.out.println("\nEnter 'view' to see products, 'buy' to purchase a product, or 'exit' to quit:");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "view":
                    dMart.displayProducts();
                    break;
                case "buy":
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    dMart.purchaseProduct(productName, quantity);
                    break;
                case "exit":
                    System.out.println("Thank you for visiting D-Mart!");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        } while (!command.equalsIgnoreCase("exit"));

        scanner.close();
    }
}
