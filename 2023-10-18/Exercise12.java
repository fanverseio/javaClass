import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write some text: ");
        String userInput = scan.nextLine();

        boolean inLoop = true;
        String letterSearched = "";
        int letterCount = 0;

        while (inLoop) {
            System.out.print("Letter you'd like to count: ");
            String searchLetter = scan.next();
            if (letterSearched.contains(searchLetter)) {
                inLoop = false;
                System.out.println("Exiting progrmme. Bye!");
                break;
            } else {
                letterSearched = letterSearched + searchLetter;
                // System.out.println(letterSearched); - testing what's been searched
                for (int i = 0; i < userInput.length(); i++) {

                    String letter = Character.toString(userInput.charAt(i));
                    if (searchLetter.equals(letter)) {
                        letterCount++;
                    }
                }

            }
            System.out.println();
            System.out.println("There are " + letterCount + " " + searchLetter + " in your sentence.");
            System.out.println();
            letterCount = 0;

        }

        scan.close();

    }
}
