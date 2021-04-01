import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void main(){
        Basket basket = new Basket();

        Product chocolateBar = new Product("chocolate bar", 12.49, 0.10, false);
        Product book = new Product("book", 12.49, 0.00, false);
        Product importChocolates = new Product("box of chocolates [imp]", 20.00, 0.15, true);

        basket.addToBasket(chocolateBar);
        basket.addToBasket(book);
        basket.addToBasket(importChocolates);

        basket.getTotal();
    }

}