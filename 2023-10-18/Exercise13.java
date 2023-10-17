
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How much is the total purchase: ");
        double totalSum = scan.nextDouble();

        double notes[] = { 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
        int noteSize = notes.length;

        int[] noteCount = new int[noteSize]; // setup an int array with the same length of notes[], but each value is 0.
                                             // This is to add each note to calculate how many notes are needed. So
                                             // it'll be noteCount[i]++

        for (int i = 0; i < noteSize; i++) {
            while (totalSum >= notes[i]) { // for as long as the total is bigger than the biggest denominator, we need
                                           // to minutes the biggest denomiator. So if the given number is 120, we need
                                           // to minus 50 twice, and when it's smaller, we move i to the next number.
                                           // when i moves, we log the i number into noteCount which was an array of the
                                           // same length but values of '0';
                totalSum = totalSum - notes[i];
                noteCount[i]++;
            }

        }
        System.out.println("We need:");

        for (int i = 0; i < noteSize; i++) {
            System.out.println("£" + notes[i] + " : " + noteCount[i]);
        }
        scan.close();
    }

}
