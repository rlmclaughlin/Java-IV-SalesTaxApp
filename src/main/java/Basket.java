import java.util.ArrayList;

public class Basket {

    ArrayList<Product> products = new ArrayList<>();

    public void addToBasket(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
