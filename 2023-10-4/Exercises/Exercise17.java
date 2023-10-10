import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println(
                "Press 1 to input your number.\nPress 2 to see how many terms to get 3.14.\nPress 3 to see how many terms to get 3.14159265358\nPress any other number to exit.");

        int choice = Integer.parseInt(scan.nextLine()); // store user's input in a variable

        if (choice == 1) {
            UserInput user = new UserInput();
            user.userInput();
        } else if (choice == 2) {

            CheckPi1 check = new CheckPi1();
            check.checkPi1();
        } else if (choice == 3) {
            CheckPi2 check = new CheckPi2();
            check.checkPi2();
        } else {
            try {
                if (choice != 1 || choice != 2 || choice != 3)
                    ;
            } catch (NumberFormatException e) {

            }
            System.out.println("Existing programme");
            System.exit(0);
        }
        scan.close();
    }
}

class UserInput {
    public void userInput() {
        int i = 1;
        double k = 3.0;
        double sum = 0.0;
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Try your a number: ");
        int n = scan.nextInt();
        while (i <= n) {

            if (i % 2 == 0) {
                sum = sum + 4.0 / k;
                k = k + 2;
                i++;

            } else if (i % 2 != 0) {

                sum = sum - 4.0 / k;
                k = k + 2;
                i++;

            }
        }
        System.out.println("The total sum of running it in " + n + " times is: " + (4.0 + sum));

        scan.close();
    }
}

class CheckPi1 {
    public void checkPi1() {
        int i = 1;
        double k = 3.00;
        double sum = 0.00;
        while (i <= 1000000) {

            if (i % 2 == 0) {
                sum = sum + 4.00 / k;

                double finalSum = 4.00 + sum;
                String str = String.valueOf(finalSum);
                if (str.substring(0, 4).equals("3.14")) {
                    break;
                } else {
                    k = k + 2;
                    i++;
                }

            } else if (i % 2 != 0) {

                sum = sum - 4.00 / k;

                double finalSum = 4.00 + sum;
                String str = String.valueOf(finalSum);
                if (str.substring(0, 4).equals("3.14")) {
                    break;
                } else {
                    k = k + 2;
                    i++;
                }
            }
        }
        System.out.println("We get 3.14 at " + (i) + " terms");

    }

}

class CheckPi2 {
    public void checkPi2() {
        boolean found = true;
        long i = 1;
        double k = 3.0;
        double sum = 0.0;
        while (i <= 1000000000) {

            if (i % 2 == 0) {
                sum = sum + 4.0 / k;

                double finalSum = 4.0 + sum;
                String str = String.valueOf(finalSum);
                if (str.substring(0, 6).equals("3.14159265358")) {
                    break;
                } else {
                    k = k + 2;
                    i++;
                }

            } else if (i % 2 != 0) {

                sum = sum - 4.0 / k;

                double finalSum = 4.0 + sum;
                String str = String.valueOf(finalSum);
                if (str.substring(0, 6).equals("3.14159265358")) {
                    break;
                } else {
                    k = k + 2;
                    i++;
                }
            } else {
                found = false;
            }
        }

        if (found) {
            System.out.println("We get 3.14159265358 at " + (i) + " terms");
        } else {
            System.out.println("Not being able to locate the exact terms within the range.");
        }
    }

}