public class Main {

    public static void main(String[] args){
        //-------------------------basket-----------------------------------------------//

        Basket basket = new Basket();

        //--------------------------products-------------------------------------------//

        Product book = new Product("book", 12.49, 0.00, false);
        Product chocolateBar = new Product("chocolate bar", 12.49, 0.10, false);
        Product cd = new Product("cd", 14.99, 0.10, false);
        Product importChocolates = new Product("box of chocolates [imp]", 10.00, 0.10, true);
        Product perfume_imp = new Product("perfume [imp]", 47.50, 0.10, true);
        Product perfume_imp2 = new Product("perfume 2 [imp]", 27.99, 0.10, true);
        Product perfume = new Product("perfume", 18.99, 0.10, false);
        Product headache_pills = new Product("packet of headache pills", 9.75, 0.0, false);
        Product importChocolates_2 = new Product("chocolates 2 [imp]", 11.25, 0.10, true);

        //----------------------first ticket------------------------//

        basket.addToBasket(book);
        basket.addToBasket(cd);
        basket.addToBasket(chocolateBar);
        basket.getTotal();

        //----------------------second ticket-----------------------//

        //basket.addToBasket(importChocolates);
        //basket.addToBasket(perfume_imp);
        //basket.getTotal();

        //---------------------third ticket--------------------------//

        //basket.addToBasket(perfume_imp2);
        //basket.addToBasket(perfume);
        //basket.addToBasket(headache_pills);
        //basket.addToBasket(importChocolates_2);
        //basket.getTotal();

}
}
