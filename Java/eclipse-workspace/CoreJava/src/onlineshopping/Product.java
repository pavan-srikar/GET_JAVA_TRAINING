package onlineshopping;



// Abstract Class - Product
abstract class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public abstract void showProductDetails();
}