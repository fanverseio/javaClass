
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean usingCalculator = true;

        Calculator obj = new Calculator();

        while (usingCalculator) {
            System.out.println();
            System.out.println(
                    "What operation would you like to apply? Press correspondent number to choose an option.\nPress 1 to add.\nPress 2 to subtract.\nPress 3 to multiply.\nPress 4 to divide\nPress 0 to exit.");
            int choice = scan.nextInt();
            if (choice == 0) {
                usingCalculator = false;
                System.out.println("Goodbye");
                scan.close();
            } else {
                double num1, num2;
                System.out.println("Give us the 1st number");
                num1 = scan.nextDouble();
                System.out.println("Give us the 2nd number");
                num2 = scan.nextDouble();
                switch (choice) {
                    case 1:
                        double resultAdd = obj.add(num1, num2);
                        System.out.println(num1 + " plus " + num2 + " is " + resultAdd);
                        break;
                    case 2:
                        double resultSub = obj.subtract(num1, num2);
                        System.out.println(num1 + " minus " + num2 + " is " + resultSub);
                        break;
                    case 3:
                        double resultMulti = obj.mutiply(num1, num2);
                        System.out.println(num1 + " times " + num2 + " is " + resultMulti);
                        break;
                    case 4:
                        double resultDiv = obj.divide(num1, num2);
                        System.out.println(num1 + " divided by " + num2 + " is " + resultDiv);
                        break;

                }
            }
        }

    }

}

class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double mutiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }
}