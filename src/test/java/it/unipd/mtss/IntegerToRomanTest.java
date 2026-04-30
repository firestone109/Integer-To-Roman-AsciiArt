/////////////////////////////////
// Francesco Guglielmo 2137975
// Luca Volpato 2147997
/////////////
/////
//
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert_NumberOne_ReturnsI() {
        // Arrange
        int number = 1;
        // Act
        String result = IntegerToRoman.convert(number);
        // Assert
        assertEquals("I", result);
    }

    @Test
    public void testConvert_NumberTwo_ReturnsII() {
        assertEquals("II", IntegerToRoman.convert(2)); //AAA
    }

    @Test
    public void testConvert_NumberThree_ReturnsIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert_NumberFour_ReturnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert_NumberFive_ReturnsV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert_NumberSix_ReturnsVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }
}