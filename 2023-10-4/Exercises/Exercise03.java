public class Exercise03 {
    public static void main(String[] args) {

        // ! What does the following code do?

        // It does nothing, because x is set to 1, so x==2 is a false statement which
        // will never trigger the System.out.

        int x = 1;
        if (x == 2) {
            System.out.println("x is " + x);
        }

    }

}