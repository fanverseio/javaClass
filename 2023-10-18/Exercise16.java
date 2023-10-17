import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scan.nextLine();
        word = word.replaceAll("[^\\sa-zA-Z0-9]", ""); // using regex to takeout all symbols and punctuations.
        word = word.replace(" ", "");
        word = word.toLowerCase();

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
