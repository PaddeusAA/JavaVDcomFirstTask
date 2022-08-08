import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FooBar1Test {
    FooBar1 fooBar1 = new FooBar1();

    @Test
    void isMultipleOfThree() {
        String actual = fooBar1.multiplicityMethods(6) ;
        String expected = "Foo";
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfFive(){
        String actual = fooBar1.multiplicityMethods(10);
        String expected = "Bar";
        assertEquals(expected, actual);
    }

    @Test
    void isMultipleOfThreeAndFive(){
        String actual = fooBar1.multiplicityMethods(15);
        String expected = "FooBar";
        assertEquals(expected, actual);
    }

}