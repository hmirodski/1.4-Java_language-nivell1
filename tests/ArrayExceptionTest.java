import exercici3.ArrayExceptionDemo;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;

public class ArrayExceptionTest {
    @Test
    public void testIndexOutOfBounds() {
        ArrayExceptionDemo demo = new ArrayExceptionDemo();

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> demo.getElementAt(10));
    }
}
