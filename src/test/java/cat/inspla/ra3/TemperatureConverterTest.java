package cat.inspla.ra3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    // ---------- Prova parametritzada Celsius -> Fahrenheit ----------

    @ParameterizedTest
    @CsvSource({
            "0, 32",
            "100, 212",
            "-40, -40"
    })
    public void testConvertCelsiusToFahrenheit(double celsius, double expected) {
        assertEquals(expected,
                converter.convertCelsiusToFahrenheit(celsius),
                0.01); // delta per decimals
    }

    // ---------- Prova parametritzada Fahrenheit -> Celsius ----------

    @ParameterizedTest
    @CsvSource({
            "32, 0",
            "212, 100",
            "-40, -40"
    })
    public void testConvertFahrenheitToCelsius(double fahrenheit, double expected) {
        assertEquals(expected,
                converter.convertFahrenheitToCelsius(fahrenheit),
                0.01); // delta per decimals
    }
}