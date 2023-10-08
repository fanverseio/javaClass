import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        // create variables prevNum, inLoop, create bool varibles, isIncrease
        // create scanner take input
        // ask for an initial input, firstNum which is use to compare the coming nubmers
        // start a loop, create int currentNum, if currentNum == -1, inLooop = false
        // if currentNum - prevNum == 1, isIncease, otherwise !isIncrease

        int prevNum = 0;
        boolean inLoop = true;
        boolean isIncrease = true;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number; enter -1 to stop: ");
        int firstNum = scan.nextInt();
        prevNum = firstNum;

        while (inLoop) {
            System.out.println("Please enter a number; enter -1 to stop: ");
            int inputNum = scan.nextInt();

            if (inputNum == -1) {
                inLoop = false;
                break;
            } else {

                if (inputNum - prevNum == 1) {
                    isIncrease = true;
                    prevNum = inputNum;
                } else {
                    isIncrease = false;
                }

            }

        }

        if (isIncrease) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
