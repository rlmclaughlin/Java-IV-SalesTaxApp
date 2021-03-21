import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    Product chocolateBar = new Product("chocolate bar", 12.49, 0.10, false);
    Product book = new Product("book", 12.49, 0.00, false);
    Product importChocolates = new Product("Box Of Chocolates [imp]", 20.00, 0.10, true);
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
            double tax = index.getPrice() * index.getTaxRate();
            expected += index.getPrice();
            actual -= tax;
        }
        assertEquals(expected, actual);
    }

    @Test
    public void applyTaxToTotal(){
        basket.addToBasket(importChocolates);
        basket.addToBasket(book);
        double expected = 0.00;
        double actual = basket.getTotal();
        for(Product index : basket.getProducts()){
            if(index.isImported()){
                double regTax = index.getTaxRate();
                double importTax = regTax += .05;
                double totalTax = index.getPrice() * importTax;
                expected += index.getPrice();
                expected += totalTax;
            } else {
                double tax = index.getPrice() * index.getTaxRate();
                expected += index.getPrice();
                expected += tax;
            }

        }
        assertEquals(expected, actual);
    }

    @Test
    public void checkIfImported(){
        boolean actual = importChocolates.isImported();
        assertTrue(actual);
    }

    @Test
    public void checkIfNotImported(){
        boolean actual = importChocolates.isImported();
        assertFalse(actual);
    }

    @Test
    public void doesRenderOnProductList(){
        ArrayList<Product>expected = new ArrayList<>(Arrays.asList(chocolateBar, importChocolates, book));
        ArrayList actual = basket.getProducts();
        basket.addToBasket(chocolateBar);
        basket.addToBasket(importChocolates);
        basket.addToBasket(book);
        assertEquals(expected, actual);
    }

    @Test
    public void receiptRendersProductWithNoTax(){
        basket.addToBasket(book);
        String expected = "1 book: 12.49";
        String actual = basket.createReceipt();
        assertEquals(expected, actual);
    }

    @Test
    public void receiptRendersProductWithTax(){
        basket.addToBasket(chocolateBar);
        String expected = "1 chocolate: 13.74";
        String actual = basket.createReceipt();
        assertEquals(expected, actual);
    }

    @Test
    public void renderReceiptList(){
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("1 chocolate bar: 13.739");
        expectedList.add("1 chocolate: 12.49");
        basket.addToBasket(chocolateBar);
        basket.addToBasket(book);
        basket.createReceipt();
        ArrayList actual = basket.getCustomerReceipt();
        assertEquals(expectedList, actual);
    }
}