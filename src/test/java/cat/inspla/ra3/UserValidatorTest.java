package cat.inspla.ra3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    UserValidator validator = new UserValidator();

    // ---------- Proves de isValidUsername ----------

    // Nom massa curt (menys de 3 caràcters)
    @Test
    public void testUsernameMassaCurt() {
        assertFalse(validator.isValidUsername("ab"));
    }

    // Nom vàlid
    @Test
    public void testUsernameValid() {
        assertTrue(validator.isValidUsername("Marc"));
    }

    // Username null
    @Test
    public void testUsernameNull() {
        assertFalse(validator.isValidUsername(null));
    }

    // ---------- Proves de isAdult ----------

    // Edat 17 → no adult
    @Test
    public void testIsAdult17() {
        assertFalse(validator.isAdult(17));
    }

    // Edat 18 → adult
    @Test
    public void testIsAdult18() {
        assertTrue(validator.isAdult(18));
    }

    // Edat 19 → adult
    @Test
    public void testIsAdult19() {
        assertTrue(validator.isAdult(19));
    }

    // ---------- Prova d'excepció ----------

    // Text obligatori buit → ha de llançar excepció
    @Test
    public void testValidateRequiredText() {
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateRequiredText("");
        });
    }
}