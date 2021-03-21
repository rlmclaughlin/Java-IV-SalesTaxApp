public class Main {

    public static void main(String[] args){
        Basket basket = new Basket();

        Product chocolateBar = new Product("chocolate bar", 12.49, 0.10, false);
        Product book = new Product("book", 12.49, 0.00, false);
        Product importChocolates = new Product("Box Of Chocolates [imp]", 20.00, 0.10, true);

        basket.addToBasket(chocolateBar);
        basket.addToBasket(book);

        basket.createReceipt();
    }
}
