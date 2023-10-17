import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        // read the input, create a empty string of the same length
        // the for the j in the empty string it will be the length-i of the input
        // string. And it should loop the same times.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String inputSentence = scan.nextLine();
        int inputLength = inputSentence.length();

        System.out.println("\nYour Palindrome is:");
        System.out.print(inputSentence);
        for (int i = 0; i < inputLength; i++) {

            char b = inputSentence.charAt(inputLength - 1 - i);

            System.out.print(b);
        }

    }

}
