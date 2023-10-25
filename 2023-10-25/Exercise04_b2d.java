
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class Exercise04_b2d {
    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("Press 1 to convert binary to decimal, press 2 to convert decimal to binary: ");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.println();
            Binary2Dec obj = new Binary2Dec();
            System.out.print("Enter your binary number: ");
            String binaryInput = scan.next();
            String result = obj.convert(binaryInput);
            System.out.println("Your decimal is: " + result);

        } else if (choice == 2) {
            System.out.println();
            DecToBinary obj = new DecToBinary();
            System.out.print("Enter your decimal number: ");
            int decimalInput = scan.nextInt();
            obj.convert(decimalInput);
        } else {
            System.out.println("Wrong input, exiting programme.");

        }

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

class DecToBinary {
    // reverse an array 
    public static int[] reverseArrayInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public void convert(int userInput) {

        NearestExponent n = new NearestExponent();
        double exponent = n.log2(Integer.valueOf(userInput));
        int arrLength = 0; // determine the length of the binary;
        if (userInput >= Math.pow(2, exponent)) {
            arrLength = (int) (exponent + 1);
        } else {
            arrLength = (int) (exponent);
        }

        int[] binaryArr = new int[arrLength];

        for (int i = 0; i < arrLength; i++) { // workout the 2 base order from left to right, so it'll be [1,2,4,8...]
            binaryArr[i] = (int) (Math.pow(2, i));
        }

        int[] revserBinaryArr = reverseArrayInPlace(binaryArr); // make the array from right to left [...8,4,2,1]
        int[] outputBinaryArr = new int[revserBinaryArr.length];
        double sum = 0;
        for (int i = 0; i < arrLength; i++) {
            if (userInput >= revserBinaryArr[i]) {
                userInput = userInput - revserBinaryArr[i];
                outputBinaryArr[i] = 1; // if the remremainder of user input is bigger than the 2^i number, log the place as 1
            } else {
                userInput = userInput - 0; // if the remainder of the user input is smaller than the 2^i, then log it as 0.
                outputBinaryArr[i] = 0;
            }
        }
        System.out.print("The binary number is: ");
        for (int i = 0; i < outputBinaryArr.length; i++) {
            System.out.print(outputBinaryArr[i]);
        }

    }
}

class NearestExponent { // https://www.geeksforgeeks.org/how-to-calculate-log-base-2-of-an-integer-in-java/
    public int log2(int N) {
        int result = (int) (Math.log(N) / Math.log(2));
        return result;
    }
}
