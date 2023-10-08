import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Give us  a number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean isPrime = true;
        int i = 2;

        if (num <= 1) {
            // isPrime = false;
            System.out.println("It's not a prime number.");
        } else if (num > 1) {
            while (i < num) {

                if (num % i == 0) {

                    isPrime = false;
                    break;
                } else {

                    i++;

                }

            }
            if (isPrime) {
                System.out.println("It's a prime number");
            } else {
                System.out.println("It's not a prime number");
            }

        }
    }

}
