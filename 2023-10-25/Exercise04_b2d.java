
import java.util.Arrays;
import java.util.Scanner;

public class Exercise04_b2d {
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("What's your binary number: ");
        String userInput = scan.next();

        Binary2Dec obj = new Binary2Dec();
        String output = obj.convert(userInput);
        System.out.println("The decimal number is: ");
        System.out.println(output);

    }
}

class Binary2Dec {
    public String convert(String inputString) {
        int length = inputString.length();

        String reverseInpuString = "";

        for (int i = 0; i < length; i++) {
            char b = inputString.charAt(length - 1 - i);

            reverseInpuString += b; // refer to day 3 exercise 15 palindrome creator.

        }

        String[] splitString = reverseInpuString.split("");

        int[] intArr = new int[length];

        for (int i = 0; i < splitString.length; i++) {
            intArr[i] = Integer.parseUnsignedInt(splitString[i]);
        }

        double sum = 0;
        // System.out.println(Arrays.toString(intArr)); // print the intArr array

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0) {
                sum += 0;
            } else {
                sum += Math.pow(2, (double) i);
                // System.out.println(sum);
            }
        }

        String result = String.valueOf((int) sum);

        return result;
    }

}
