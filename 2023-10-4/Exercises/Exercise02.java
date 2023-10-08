public class Exercise02 {
    public static void main(String[] args) {

        // !What does the following piece of code do?

        java.util.Scanner scan = new java.util.Scanner(System.in);

        int i = scan.nextInt();
        while (i < 10) {
            i = i + 1;
            int j = scan.nextInt();
            if (j == 0) {
                break;
            } else if (j != 1) {
                System.out.println(j);
            }

        }
        System.out.println("finished");

        // It asks the user a number. if the number is bigger or equals to 10, it says
        // finished. If it's smaller than 10, it starts a loop which is based on the
        // user input. For example, if the user's input is 5, it'll loop 5 times,
        // 5,6,7,8,9.
        // When it goes in the loop, it will ask the user a number, if the input is 0,
        // the loop breaks and it says 'finished.' if the number is 1, it outputs
        // nothing and goes into the next loop.
        // if the user's number is either 0,or 1, then it repeats the user input and
        // then goes to the next loop.

    }
}
