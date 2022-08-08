import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBar3Test {
    FooBar3.MultiplicityClass fooBar3 = new FooBar3.MultiplicityClass();

    @Test
    void isMultipleOfThree() {
        boolean actual = fooBar3.isMultipleOfThree(6);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfFive() {
        boolean actual = fooBar3.isMultipleOfFive(10);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfThreeAndFive() {
        boolean actual = fooBar3.isMultipleOfThreeAndFive(15);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}