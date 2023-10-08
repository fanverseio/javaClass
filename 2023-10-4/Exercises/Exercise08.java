import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        // 1. declare some int to use for comaprison later.

        // 2. create a boolean called inLoop, when inLoop is false, loop breaks.

        // 3. create a scan object, as user to key in their input.

        // 4. store the first object into num1, second ojbect into num2, when i
        // increase, compares the two nums and get the bigger one.

        // create break condition, when input == -1, break.

        // output num1 or num2 which ever is bigger.

        long prevInput = 0;
        long biggerInput = 0;
        boolean inLoop = true;

        Scanner scan = new Scanner(System.in);

        while (inLoop) {
            System.out.println("Key in a number, enter -1 to exit: ");
            long currentInput = scan.nextInt();

            if (currentInput == -1) {
                inLoop = false;
                break;
            } else if (currentInput > prevInput) {
                biggerInput = currentInput;
                prevInput = currentInput;

            } else if (currentInput < prevInput) {
                biggerInput = prevInput;
            }

        }
        System.out.println("The biggest number in the sequence is: " + biggerInput);

    }
}
