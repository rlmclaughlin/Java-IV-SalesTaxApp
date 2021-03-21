import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Product chocolateBar = new Product("Chocolate Bar", 12.49, 0.10, false);
    Product book = new Product("Book", 10.00, 0.00, false);
    Basket basket = new Basket();

    @Test
    public void setup(){
    }

    @Test
    public void itemAddedToBasket(){
        basket.addToBasket(chocolateBar);
        int actual = 1;
        int expected = basket.products.size();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddList(){
        basket.addToBasket(chocolateBar);
        basket.addToBasket(book);
        double expected = 0.00;
        double actual = basket.getTotal();
        for(Product index : basket.getProducts()){
            expected += index.getPrice();
        }
        assertEquals(expected, actual);
    }

    @Test
    public void applyTaxToTotal(){
        basket.addToBasket(chocolateBar);
        basket.addToBasket(book);
        double expected = 0.00;
        double actual = basket.getTotal();
        for(Product index : basket.getProducts()){
            double tax = index.getPrice() * index.getTaxRate();
            expected += index.getPrice();
            expected += tax;
        }
        assertEquals(expected, actual);
    }
}