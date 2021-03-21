import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void setup(){

    }

    @Test
    public void productIsCreated(){
        Product chocolateBar = new Product("Chocolate Bar", 12.49, 0.00, false);
        String expected = "Chocolate Bar";
        String actual = chocolateBar.getName();
        assertEquals(expected, actual);
    }

}