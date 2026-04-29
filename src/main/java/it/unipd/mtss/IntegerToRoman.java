/////////////////////////////////
// Francesco Guglielmo 2137975
// Luca Volpato 2147997
/////////////
/////
//
package it.unipd.mtss;

public class IntegerToRoman {
    
    public static String convert(int number) {
        if (number == 1) {
            return "I";
        } else if (number == 2) {
            return "II";
        } else if (number == 3) {
            return "III";
        }
        return null;
    }
}