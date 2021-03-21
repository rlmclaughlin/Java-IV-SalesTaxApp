import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product product = new Product();

    @Test
    public void setup(){
    }

    @Test
    public void productIsCreated(){
        Product chocolateBar = new Product("Chocolate Bar", 12.49, 0.00, false);
        assertEquals(product, chocolateBar);
    }

}