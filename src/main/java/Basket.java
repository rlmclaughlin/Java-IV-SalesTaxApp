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
            total += index.getPrice();
        }
        return total;
    }
}
