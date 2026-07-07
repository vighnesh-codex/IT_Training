package Day_14.home_task;

import java.util.ArrayList;
import java.util.List;


class NegativeQuantityException extends Exception {
    public NegativeQuantityException(String message) {
        super(message);
    }
}


class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }


    public void reduceStock(int quantity) throws NegativeQuantityException, InsufficientStockException {
        if (quantity < 0) {
            throw new NegativeQuantityException("Quantity cannot be negative for product: " + name);
        }
        if (quantity > stock) {
            throw new InsufficientStockException("Not enough stock available for " + name + ". Available: " + stock);
        }
        this.stock -= quantity;
    }
}


class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class OrderItem {
    Product product;
    int quantity;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}


class BillingSystem {
    private List<OrderItem> currentOrder = new ArrayList<>();


    public void addItemToBill(Product product, int quantity) {
        try {
            product.reduceStock(quantity);
            currentOrder.add(new OrderItem(product, quantity));
        } catch (NegativeQuantityException | InsufficientStockException e) {
            System.err.println("Error processing item: " + e.getMessage());
        }
    }

    public void printBill() {
        System.out.println("\n======= RAMPEX STORE BILL =======");
        System.out.printf("%-10s %-10s %-8s %-10s\n", "Item", "Price", "Qty", "Total");
        System.out.println("---------------------------------");

        double grandTotal = 0;
        for (OrderItem item : currentOrder) {
            System.out.printf("%-10s $%-9.2f %-8d $%-9.2f\n",
                    item.product.getName(), item.product.getPrice(), item.quantity, item.getTotalPrice());
            grandTotal += item.getTotalPrice();
        }
        System.out.println("---------------------------------");
        System.out.printf("Grand Total: $%.2f\n", grandTotal);
        System.out.println("=================================\n");
    }
}

public class ParallelArraysToObj {
    public static void main(String[] args) {

        Product mazza = new Product("Mazza", 1.50, 50);
        Product pepsi = new Product("Pepsi", 2.00, 40);

        BillingSystem billing = new BillingSystem();


        billing.addItemToBill(mazza, 3);
        billing.addItemToBill(pepsi, 2);


        billing.addItemToBill(mazza, -5);


        billing.printBill();


        System.out.println("Updated Stock - Mazza: " + mazza.getStock() + ", Pepsi: " + pepsi.getStock());
    }
}