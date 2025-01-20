import static org.junit.jupiter.api.Assertions.*;

class BikeFactoryTest {

    @Test
    void testCreateExpensiveBike(){
        double price = BikeFactory.createExpensiveBike("a").getGrossPrice();
        assertTrue(price >= 800, String.format("price %.2f not >= 900", price));

    }
}