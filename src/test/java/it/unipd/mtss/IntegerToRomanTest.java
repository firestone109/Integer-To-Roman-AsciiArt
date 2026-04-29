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
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvert_NumberThree_ReturnsIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }
}