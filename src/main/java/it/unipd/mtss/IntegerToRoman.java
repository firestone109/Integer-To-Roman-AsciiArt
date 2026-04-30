/////////////////////////////////
// Francesco Guglielmo 2137975
// Luca Volpato 2147997
/////////////
/////
//
package it.unipd.mtss;

public class IntegerToRoman { 

    public static String convert(int number) { 
        int[] values = {5, 4, 1}; 
        String[] romanLetters = {"V", "IV", "I"}; //valori chiave 
        
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                roman.append(romanLetters[i]);
                number -= values[i];
            }
        }
        
        return roman.toString();
    }
}