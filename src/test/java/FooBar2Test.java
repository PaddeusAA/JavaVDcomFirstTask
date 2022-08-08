import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBar2Test {
    FooBar2 fooBar2 = new FooBar2();

    @Test
    void isMultipleOfThree() {
        String actual = fooBar2.isMultipleOfThree(6);
        String expected = "Foo";
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfFive() {
        String actual = fooBar2.isMultipleOfFive(10);
        String expected = "Bar";
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfThreeAndFive() {
        String actual = fooBar2.isMultipleOfThreeAndFive(15);
        String expected = "FooBar";
        assertEquals(expected, actual);
    }

}