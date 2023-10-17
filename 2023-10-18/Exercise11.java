import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        // there should be two loops, one is to check the sentence one by one. The inner
        // loop checks each word of the search terms against the long sentence. When
        // there's an unmatch, it breaks out to the outer loop.

        // if all checks are good, when j is the same length of the search term, it
        // becomes a match and adds to the int.

        int matchFound = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type your sentence below please:");
        String userInput = scan.nextLine();
        System.out.println();
        System.out.println("What would you like to search? ");
        String searchTerm = scan.nextLine();

        for (int i = 0; i <= userInput.length() - searchTerm.length(); i++) {
            int j;
            for (j = 0; j < searchTerm.length(); j++) {
                char a = searchTerm.charAt(j);
                char b = userInput.charAt(i + j);
                if (a != b) {
                    break;
                }
            }
            if (j == searchTerm.length()) {
                matchFound++;
            }
        }
        System.out.println(
                "Your search term was found " + matchFound + " times.");
    }
}
