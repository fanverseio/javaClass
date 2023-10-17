import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {
        // trim space of the input.
        // find out if it's odd or even
        // for length of even number, i == varable.length -(i+1), i < length/2, i++

        // for length of odd number, mid letter is length/2, i < length/2, i++;

        // any !=, break, else, yes

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.nextLine();
        word = word.replace(" ", "");

        int wordLength = word.length();
        boolean isPalindrome = true;

        if (wordLength % 2 == 0) {
            for (int i = 0; i < (wordLength) / 2; i++) {

                char a = word.charAt(i);
                char b = word.charAt(wordLength - 1 - i);

                if (a == b) {
                    isPalindrome = true;

                } else {
                    isPalindrome = false;
                }

            }

        } else if (wordLength % 2 != 0) {
            for (int i = 0; i < (wordLength - 1) / 2; i++) {
                char x = word.charAt(i);
                char y = word.charAt(wordLength - 1 - i);

                if (x == y) {
                    isPalindrome = true;

                } else {
                    isPalindrome = false;
                }
            }

        }

        if (isPalindrome) {
            System.out.println("It's a Palindrome!");
        } else {
            System.out.println("It's not a Palindrome!");
        }

        scan.close();
    }

}
