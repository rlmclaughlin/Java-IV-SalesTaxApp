import java.text.DecimalFormat;
import java.util.ArrayList;

public class Basket {
    DecimalFormat df2 = new DecimalFormat("#.##");
    ArrayList<Product> products = new ArrayList<>();
    ArrayList<String> customerReceipt = new ArrayList<>();

    double total = 0.00;
    double salesTax = 0.00;

    public void addToBasket(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<String> getCustomerReceipt() {
        return customerReceipt;
    }

    public double getTotal(){
        for(Product index : getProducts()){
            if(index.isImported()){
                double regTax = index.getTaxRate();
                double tax = index.getPrice() * (regTax + .05);
                total += (index.getPrice() + tax);
                salesTax += tax;
            } else {
                double tax = index.getPrice() * index.getTaxRate();
                total += index.getPrice();
                total += tax;
                salesTax += tax;
            }
        }
        createReceipt();
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
                double totalWithTax = unitPrice += totalTax;
                receipt = "1 " + index.getName() + ": " + df2.format(totalWithTax);
                customerReceipt.add(receipt);
            } else {
                double tax = index.getPrice() * index.getTaxRate();
                double totalWithTax = unitPrice += tax;
                receipt = "1 " + index.getName() + ": " + df2.format(totalWithTax);
                customerReceipt.add(receipt);
            }
        }
        System.out.println(renderReceipt());
        return receipt;
    }

    public String renderReceipt(){
        System.out.println("\n ****************************** \n");
        System.out.println("Receipt:");
        for(String index : customerReceipt){
            System.out.println(index);
        }
        System.out.println("Sales Taxes: " + df2.format(salesTax));
        System.out.println("Total: " + df2.format(total));
        System.out.println("\n ****************************** \n");
        return customerReceipt.toString();
    }

}
