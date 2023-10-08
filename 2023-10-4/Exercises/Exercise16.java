
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        CheckPrime obj = new CheckPrime();

        Scanner scan = new Scanner(System.in);
        System.out.println("Give us a number: ");
        int userInput = scan.nextInt();

        int i = 0;
        int j = 0;
        boolean found = false;
        int numPlus = 0;
        int numMinus = 0;

        while (!found) {
            if (obj.checkPrime(userInput + i) == false) {
                numPlus = userInput + i;
                found = false;
                i++;
            } else if (obj.checkPrime(userInput - j) == false) {
                numMinus = userInput - j;
                found = false;
                j++;
            } else {
                found = true;
                numPlus = userInput + i;
                numMinus = userInput - j;
                break;
            }
        }

        // System.out.println(i);
        // System.out.println(j);

        if (j == i) {
            System.out.println(numMinus);
            System.out.println(numPlus);

        } else if (j > i) {
            System.out.println(numPlus);
        } else if (i > j) {
            System.out.println(numMinus);

        }
        scan.close();
    }
}

class CheckPrime {
    public boolean checkPrime(int x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }
}