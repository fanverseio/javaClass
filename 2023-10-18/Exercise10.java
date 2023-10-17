import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        int totalCount = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Type your sentence below please:");
        String userInput = scan.nextLine();

        System.out.println();
        System.out.println("Here's your sentence");
        System.out.println(userInput);
        System.out.println("What letter would you like to count?");
        String letterToFind = scan.nextLine();

        for (int i = 0; i <= userInput.length() - 1; i++) {
            String letter = Character.toString(userInput.charAt(i));

            if (letter.equals(letterToFind)) {
                totalCount++;
            }
        }

        System.out.println(
                "There are a total of " + totalCount + " " + "\"" + letterToFind + "\"" + " in your sentence.");
        scan.close();

    }
}
