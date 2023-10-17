
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean usingCalculator = true;
        double num1 = 0, num2 = 0;
        Calculator obj = new Calculator();
        String operationSymbolString = "";

        while (usingCalculator) {

            System.out.println();
            System.out.println(
                    "Enter your maths operations (2+3, 3/6,etc, or press 'q' to quit the programme):");
            String choice = scan.nextLine();
            if (choice.equals("q")) {
                usingCalculator = false;
                System.out.println("Goodbye!");
                scan.close();
            } else {

                String operation = choice.replaceAll("\\s", "");
                Pattern opPattern = Pattern.compile("[\\+\\-\\*\\/]");
                Matcher matcherOp = opPattern.matcher(operation);

                if (matcherOp.find()) {
                    Pattern firstNumPattern = Pattern.compile("\\d+");
                    Matcher matchfirstNum = firstNumPattern.matcher(operation);
                    if (matchfirstNum.find()) {
                        String num1String = matchfirstNum.group();
                        num1 = Double.parseDouble(num1String);

                    } else {
                        System.out.println("Contain invalid characters");
                    }

                    Pattern secondNumPattern = Pattern.compile("([\\+\\-\\*\\/])(?<number>\\d+)");
                    Matcher matchSecondNum = secondNumPattern.matcher(operation);
                    if (matchSecondNum.find()) {
                        String num2String = matchSecondNum.group().substring(1, matchSecondNum.group().length());
                        num2 = Double.parseDouble(num2String);

                    } else {
                        System.out.println("Contain invalid characters");
                    }

                    Pattern operationSymbol = Pattern.compile("[\\+\\-\\*\\/]");
                    Matcher matchOperation = operationSymbol.matcher(operation);

                    if (matchOperation.find()) {
                        operationSymbolString = matchOperation.group();

                    }

                    if (operationSymbolString.equals("+")) {

                        double resultAdd = obj.add(num1, num2);
                        System.out.println(resultAdd);
                    } else if (operationSymbolString.equals("-")) {
                        double resultSub = obj.subtract(num1, num2);
                        System.out.println(resultSub);
                    } else if (operationSymbolString.equals("*")) {
                        double resultMult = obj.mutiply(num1, num2);
                        System.out.println(resultMult);
                    } else {
                        double resultDiv = obj.divide(num1, num2);
                        System.out.println(resultDiv);
                    }

                } else {
                    System.out.println("Invalid");

                }

                // switch (choice) {
                // case 1:
                // double resultAdd = obj.add(num1, num2);
                // System.out.println(num1 + " plus " + num2 + " is " + resultAdd);
                // break;
                // case 2:
                // double resultSub = obj.subtract(num1, num2);
                // System.out.println(num1 + " minus " + num2 + " is " + resultSub);
                // break;
                // case 3:
                // double resultMulti = obj.mutiply(num1, num2);
                // System.out.println(num1 + " times " + num2 + " is " + resultMulti);
                // break;
                // case 4:
                // double resultDiv = obj.divide(num1, num2);
                // System.out.println(num1 + " divided by " + num2 + " is " + resultDiv);
                // break;

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