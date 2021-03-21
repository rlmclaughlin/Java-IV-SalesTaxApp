import java.util.ArrayList;

public class Basket {

    ArrayList<Product> products = new ArrayList<>();
    double total = 0.00;
    double salesTax = 0.00;

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
                salesTax = index.getPrice() * (regTax + .05);
                total += index.getPrice();
                total += salesTax;
            }
            salesTax = index.getPrice() * index.getTaxRate();
            total += index.getPrice();
            total += salesTax;
        }
        return total;
    }

    public String createReceipt(){
        String receipt = "No items in the basket";

        for(Product index : getProducts()){
            double unitPrice = index.getPrice();
            if(index.isImported()){
                double regTax = index.getTaxRate();
                double importTax = regTax += .05;
                double totalTax = index.getPrice() * importTax;
                double totalWithTax = Math.round(unitPrice += totalTax);
                receipt = "1 " + index.getName() + ": " + totalWithTax;
            } else {
                double tax = index.getPrice() * index.getTaxRate();
                double totalWithTax = Math.round(unitPrice += tax);

                receipt = "1 " + index.getName() + ": " + totalWithTax;
            }
        }
        System.out.println(receipt);
        return receipt;
    }
}
