import java.util.*;
import java.util.ArrayList;

public class Exercise05 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("Enter a decimal or hexadecimal number: ");
        String userInput = scan.next();

        HexaToDecimal hex = new HexaToDecimal();
        DecimalToHex dec = new DecimalToHex();

        if (userInput.charAt(0) == '0' && userInput.charAt(1) == 'x') {
            hex.convertToDecimal(userInput);
        } else {
            dec.convertToHexadecimal(userInput);
        }

    }
}

class HexaToDecimal {
    public String convertToDecimal(String x) {
        // https://www.geeksforgeeks.org/hashmap-get-method-in-java/
        // HashMap<String, Double> hexaCodes = new HashMap<String, Double>();
        // hexaCodes.put("a", 10.0);
        // hexaCodes.put("b", 11.0);
        // hexaCodes.put("c", 12.0);
        // hexaCodes.put("d", 13.0);
        // hexaCodes.put("e", 14.0);
        // hexaCodes.put("f", 15.0);

        String xStrippedx0 = x.toLowerCase().substring(2, x.length());
        System.out.println(xStrippedx0);
        double decSum = 0.0;
        double currentCharDouble = 0;
        for (int i = 0; i < xStrippedx0.length(); i++) {
            String currentChar = String.valueOf(xStrippedx0.charAt(i));

            switch (currentChar) {
                case "a":
                    currentCharDouble = 10;
                    break;
                case "b":
                    currentCharDouble = 11;
                    break;
                case "c":
                    currentCharDouble = 12;
                    break;
                case "d":
                    currentCharDouble = 13;
                    break;
                case "e":
                    currentCharDouble = 14;
                    break;
                case "f":
                    currentCharDouble = 15;
                    break;
                default: // https://www.tutorialspoint.com/java/lang/character_getnumericvalue.htm
                    currentCharDouble = Character.getNumericValue(xStrippedx0.charAt(i));
            }
            // System.out.print(currentCharDouble + " ");
            // System.out.println(xStrippedx0.length() - i);
            decSum = decSum + currentCharDouble * Math.pow(16, xStrippedx0.length() - i - 1);
            // System.out.println(decSum);
        }
        System.out.println("Decimal value is " + decSum);

        return null;
    }
}

// https://www.geeksforgeeks.org/java-program-for-decimal-to-hexadecimal-conversion/
class DecimalToHex {
    public String convertToHexadecimal(String x) {
        int input = Integer.parseInt(x);

        char[] hexaDecimal = new char[100];
        char[] hexaCodes = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

        int i = 0;
        while (input != 0) {
            int remainder = input % 16;
            hexaDecimal[i] = hexaCodes[remainder];
            i++;
            input = input / 16;
        }

        System.out.print("Your hexadecimal number is: 0x");
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(hexaDecimal[j]);
        }

        return null;
    }
}
