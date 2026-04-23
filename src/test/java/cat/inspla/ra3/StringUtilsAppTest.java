package cat.inspla.ra3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsAppTest {

    // Creem l’objecte de la classe que volem provar
    private final StringUtilsApp utils = new StringUtilsApp();

    @ParameterizedTest
    @CsvSource({
            "'Hola    món', 'Hola món'",
            "'   Java   test   ', 'Java test'"
    })
    void normalizeSpacesRedueixEspaisMultiples(String input, String expected) {

        // Comprovem que el mètode elimina espais sobrants correctament
        assertEquals(expected, utils.normalizeSpaces(input));
    }
}