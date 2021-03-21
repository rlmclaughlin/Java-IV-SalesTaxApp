import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    Basket basket = new Basket();

    @Test
    public void setup(){
    }

    @Test
    public void basketIsCreated(){
        Product chocolateBar = new Product("Chocolate Bar", 12.49, 0.00, false);
        basket.addToBasket(chocolateBar);
        int actual = 0;
        int expected = basket.products.size();
        assertEquals(expected, actual);
    }

}