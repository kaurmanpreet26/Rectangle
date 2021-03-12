import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {
    @Test
    void shouldReturnOneIfDefaultValueOfWidthHeightUsed() {
        Rectangle rectangle = new Rectangle();

        double result = rectangle.area();

        assertEquals(1, result);
    }

    @Test
    void shouldReturnAreaOfPositiveNumbers() {
        Rectangle rectangle = new Rectangle(4, 5);

        double result = rectangle.area();

        assertEquals(20, result);
    }

    @Test
    void shouldReturnZeroIfOneOfLengthOrBreadthIsZero() {
        Rectangle rectangle = new Rectangle(0, 5);

        double result = rectangle.area();

        assertEquals(0, result);
    }

    @Test
    void shouldThrowExceptionIfLengthOrBreadthIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, -1), "Length or breadth is zer0");
    }

    @Test
    void shouldReturnPerimeterZeroIfLengthOrBreathIsZero() {
        Rectangle rectangle = new Rectangle(1, 0);

        double actualperimeter = rectangle.perimeter();

        assertEquals(0, actualperimeter);
    }

    @Test
    void shouldReturnPerimeterForValidLengthAndBreadth() {
        Rectangle rectangle = new Rectangle(1, 4);

        double actualperimeter = rectangle.perimeter();

        assertEquals(10, actualperimeter);
    }
}
