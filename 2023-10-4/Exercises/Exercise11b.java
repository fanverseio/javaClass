import java.util.Scanner;

public class Exercise11b {
    public static void main(String[] args) {

        int i = 1;
        while (i < 9) {

            int j = 1;
            while (j < 9 - i) {
                System.out.print(" ");
                j++;

            }
            System.out.print(i);

            i++;

        }

    }
}