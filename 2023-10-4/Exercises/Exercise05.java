import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Give us the 1st number:");
        int num1 = scan.nextInt();

        System.out.println("Give us the 2st number:");
        int num2 = scan.nextInt();

        int sum = 0;
        int i = 1;

        if (num1 < 0 && num2 > 0) {
            int absNum1 = 0 - num1;
            while (i <= num2) {
                sum = sum + absNum1;
                i++;
            }
            System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + (0 - sum));

        } else if (num1 > 0 && num2 < 0) {
            int absNum2 = 0 - num2;
            while (i <= num1) {
                sum = sum + absNum2;
                i++;
            }

            System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + (0 - sum));
        } else if (num1 < 0 && num2 < 0) {
            int absNum1 = 0 - num1;
            int absNum2 = 0 - num2;
            while (i <= absNum1) {
                sum = sum + absNum2;
                i++;

            }
            System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + sum);
        } else if (num1 > 0 && num2 > 0) {
            while (i <= num2) {
                sum = sum + num1;
                i++;
            }

            System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + sum);
        }

    }
}

// ! Why brining in a class doesn't work.
// class Abs {

// public int absolute(int x) {
// return x - x - x;
// }
// }
