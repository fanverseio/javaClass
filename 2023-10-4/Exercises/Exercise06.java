import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        boolean noValidNum = false;

        Scanner scan = new Scanner(System.in);

        while (!noValidNum) {
            System.out.println("Give us the 1st positive number:");
            num1 = scan.nextInt();
            System.out.println("Give us the 2nd positive number:");
            num2 = scan.nextInt();
            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Not a valid number, try again!");
            } else {
                noValidNum = true;
            }
        }

        System.out.println(num1);
        System.out.println(num2);

        if (num1 == num2) {
            System.out.println(num1 + "divided by " + num2 + " is 1, remainder 0");
        } else if (num1 < num2) {
            System.out.println(num1 + "divided by " + num2 + " has a remainder of  " + num1);
        } else {
            int i = 0;
            int remainder = num1 - num2;

            while (remainder >= 0) {
                i++;
                remainder = remainder - num2;

            }

            System.out.println(num1 + " divided by " + num2 + " is " + i + ", remainder is " + (num2 + remainder));

        }

    }
}
