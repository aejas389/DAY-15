import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private int price;
    private int quantity;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity = 0; // Initialize quantity to 0
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        int total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public int getDistinctProductCount() {
        return products.size();
    }

    public void printBill() {
        System.out.println("\n--- Shopping Bill ---");
        System.out.println("========================");
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getQuantity() + " x " + product.getPrice() + " = " + product.getTotalPrice());
        }
        System.out.println("------------------------");
    }
}

public class DmartShopping1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create products
        Product rice = new Product("RICE", 70);
        Product oil = new Product("OIL", 150);
        Product sugar = new Product("SUGAR", 50);
        Product snacks = new Product("SNACKS", 200);
        Product coldDrinks = new Product("COOLDRINKS", 100);
        Product beautyProducts = new Product("BEAUTYPRODUCTS", 1000);
        Product pulses = new Product("PULSES", 200);
        Product clothes = new Product("CLOTHES", 1200);
        Product vegetables = new Product("VEGETABLES", 100);
        Product fruits = new Product("FRUITS", 250);
        Product utensils = new Product("UTENSILS", 500);

        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Input quantities
        System.out.print("Enter quantity of RICE: ");
        rice.setQuantity(scanner.nextInt());
        cart.addProduct(rice);

        System.out.print("Enter quantity of OIL: ");
        oil.setQuantity(scanner.nextInt());
        cart.addProduct(oil);

        System.out.print("Enter quantity of SUGAR: ");
        sugar.setQuantity(scanner.nextInt());
        cart.addProduct(sugar);

        System.out.print("Enter quantity of SNACKS: ");
        snacks.setQuantity(scanner.nextInt());
        cart.addProduct(snacks);

        System.out.print("Enter quantity of COOLDRINKS: ");
        coldDrinks.setQuantity(scanner.nextInt());
        cart.addProduct(coldDrinks);

        System.out.print("Enter quantity of BEAUTYPRODUCTS: ");
        beautyProducts.setQuantity(scanner.nextInt());
        cart.addProduct(beautyProducts);

        System.out.print("Enter quantity of PULSES: ");
        pulses.setQuantity(scanner.nextInt());
        cart.addProduct(pulses);

        System.out.print("Enter quantity of CLOTHES: ");
        clothes.setQuantity(scanner.nextInt());
        cart.addProduct(clothes);

        System.out.print("Enter quantity of VEGETABLES: ");
        vegetables.setQuantity(scanner.nextInt());
        cart.addProduct(vegetables);

        System.out.print("Enter quantity of FRUITS: ");
        fruits.setQuantity(scanner.nextInt());
        cart.addProduct(fruits);

        System.out.print("Enter quantity of UTENSILS: ");
        utensils.setQuantity(scanner.nextInt());
        cart.addProduct(utensils);

        // Calculate total and apply discount
        double totalAmount = cart.calculateTotal();
        int numberOfProducts = cart.getDistinctProductCount();
        double finalAmount;
        cart.printBill();

        if (numberOfProducts >= 6) {
            finalAmount = totalAmount * 0.9; // 10% discount
            System.out.println("10% discount applied.");
            System.out.println("Total Amount ="+finalAmount);
            System.out.println("========================");
        } else {
            finalAmount = totalAmount;
            System.out.println("No discount applied.");
            System.out.println("Total Amount ="+finalAmount);
            System.out.println("========================");
        }
    }
}
