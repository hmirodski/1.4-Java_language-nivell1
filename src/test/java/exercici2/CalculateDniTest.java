package exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "0, T",
            "1, R",
            "99999999, R",
            "12345679, S",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A"
    })
    public void calculateDniShouldReturnExpectedLetter(int number, char expectedLetter) {
        char calculatedLetter = CalculoDni.calculateLetter(number);
        Assertions.assertEquals(expectedLetter, calculatedLetter);
    }

}
