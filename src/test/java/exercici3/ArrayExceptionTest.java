package exercici3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayExceptionTest {

    private ArrayExceptionDemo demo;

    @BeforeEach
    public void setUp() {
        demo = new ArrayExceptionDemo();
    }

    @Test
    public void accessingInvalidIndexShouldThrowArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> demo.getElementAt(10));
    }
}
