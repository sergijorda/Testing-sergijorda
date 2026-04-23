package cat.inspla.ra3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {

    Cart cart;

    // Es crea una cistella nova abans de cada test
    @BeforeEach
    public void setUp() {
        cart = new Cart();
    }

    // Verificar que una cistella nova té total zero
    @Test
    public void testCartNovaTotalZero() {
        assertEquals(0.0, cart.getTotal(), 0.01);
    }

    // Verificar que afegir un article incrementa el total
    @Test
    public void testAfegirArticleIncrementaTotal() {
        cart.addItem("Portàtil", 500.0);

        assertEquals(500.0, cart.getTotal(), 0.01);
        assertEquals(1, cart.getItemCount());
    }

    // Verificar que clear deixa la cistella buida
    @Test
    public void testClearBuidaCistella() {
        cart.addItem("Ratolí", 25.0);
        cart.addItem("Teclat", 50.0);

        cart.clear();

        assertEquals(0.0, cart.getTotal(), 0.01);
        assertEquals(0, cart.getItemCount());
    }
}