import java.util.Scanner;

public class Exercise11b_s {
    public static void main(String[] args) {

        int i = 1;
        while (i < 9) {

            int j = 1;
            while (j < 9) {
                if (j < (9 - i) + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
                j++;

            }

            System.out.println(i);

            i++;

        }

    }
}
