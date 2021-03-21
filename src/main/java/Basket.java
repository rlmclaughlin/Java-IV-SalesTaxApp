import java.util.ArrayList;

public class Basket {

    ArrayList<Product> products = new ArrayList<>();
    double total = 0.00;

    public void addToBasket(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double getTotal(){
        for(Product index : getProducts()){
            if(index.isImported()){
                double regTax = index.getTaxRate();
                double importTax = index.getPrice() * (regTax + .05);
                total += index.getPrice();
                total += importTax;
            }
            double tax = index.getPrice() * index.getTaxRate();
            total += index.getPrice();
            total += tax;
        }
        return total;
    }
}
