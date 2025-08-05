package assignmnet4;
public class Product {
    // Private attributes
    private String productId;
    private String productName;
    private double price;
    private boolean inStock;

    // Constructor to initialize all attributes
    public Product(String productId, String productName, double price, boolean inStock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    // Getter methods
    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    // Setter for price
    public void setPrice(double newPrice) {
        System.out.println("Current Price: " + price);
        if (newPrice < 0) {
            System.out.println("Error: Price cannot be negative. Update skipped.");
        } else {
            price = newPrice;
            System.out.println("Updated Price: " + price);
        }
        System.out.println();
    }

    // Setter for stock status
    public void setInStock(boolean status) {
        System.out.println("Current Stock Status: " + (inStock ? "In Stock" : "Out of Stock"));
        inStock = status;
        System.out.println("Updated Stock Status: " + (inStock ? "In Stock" : "Out of Stock"));
        System.out.println();
    }
}