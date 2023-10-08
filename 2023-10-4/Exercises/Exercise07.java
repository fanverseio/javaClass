import java.util.Scanner;

public class Exercise07 {

    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Give us the 1st number: ");
        num1 = scan.nextDouble();

        System.out.println("Give us the 2nd number: ");
        num2 = scan.nextDouble();

        System.out.println("Give us the 3rd number: ");
        num3 = scan.nextDouble();

        if (num1 < num2 && num2 < num3) {
            System.out.println(" Lowest: " + num1 + " Middle: " + num2 + " Highest: " + num3);
        } else if (num2 < num1 && num1 < num3) {
            System.out.println(" Lowest: " + num2 + " Middle: " + num1 + " Highest: " + num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.println(" Lowest: " + num1 + " Middle: " + num3 + " Highest: " + num2);
        } else if (num3 < num1 && num1 < num2) {
            System.out.println(" Lowest: " + num3 + " Middle: " + num1 + " Highest: " + num2);
        } else if (num3 < num2 && num2 < num1) {
            System.out.println(" Lowest: " + num3 + " Middle: " + num2 + " Highest: " + num1);
        } else if (num2 < num3 && num3 < num1) {
            System.out.println(" Lowest: " + num2 + " Middle: " + num3 + " Highest: " + num1);
        }

    }

}