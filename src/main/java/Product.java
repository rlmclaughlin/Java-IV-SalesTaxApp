public class Product {
    String name;
    double price;
    double taxRate;
    boolean isImported;

    public Product() {
        System.out.println("Product is currently unpopulated");
    }

    public Product(String name, double price, double taxRate, boolean isImported) {
        this.name = name;
        this.price = price;
        this.taxRate = taxRate;
        this.isImported = isImported;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public double getTaxRate() {
        return taxRate;
    }


    public boolean isImported() {
        return isImported;
    }


}

