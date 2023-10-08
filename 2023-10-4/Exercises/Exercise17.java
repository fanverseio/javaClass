import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        double sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Give us a number: ");
        double n = scan.nextDouble();

        int i = 1;
        int j = 1
        boolean stop = true;

        while (!stop) {
            System.out.println("Press 1 to continue, 0 to stop: ");
            int enter = scan.nextInt();

            double nextNum = 4 / i;
            sum = 4 * (4 / i) + nextNum;
            if (isEven(i) == true) {

            }

            if (enter == 1) {
                i = i + 2;
            } else if (enter == 0) {
                stop = true;
                break;
            }
        }

    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static boolean isOdd(int x) {
        return x % 2 != 0;
    }

}
