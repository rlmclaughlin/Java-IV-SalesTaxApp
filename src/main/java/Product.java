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

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isImported() {
        return isImported;
    }

    public void setImported(boolean imported) {
        isImported = imported;
    }

}

