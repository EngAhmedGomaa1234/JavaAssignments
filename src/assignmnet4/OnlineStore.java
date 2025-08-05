package assignmnet4;
public class OnlineStore {
    public static void main(String[] args) {
        // Create a Product object
        Product p1 = new Product("P001", "Laptop", 1200.0, true);

        // Print initial product details
        System.out.println("----- Initial Product Details -----");
        System.out.println("ID: " + p1.getProductId());
        System.out.println("Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
        System.out.println("In Stock: " + p1.isInStock());
        System.out.println("-----------------------------------\n");

        // Try updating price (valid)
        p1.setPrice(1500.0);

        // Try updating price (invalid - negative)
        p1.setPrice(-100.0);

        // Change stock status
        p1.setInStock(false);
    }
}