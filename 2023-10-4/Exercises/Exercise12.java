
import java.util.ArrayList;
import java.util.List;

public class Exercise12 {

    public static void main(String[] args) {
        // start from 3, initial value i 3
        // create an empty list.
        // used the previous exercise to create a checkPrime class, check each number if
        // for each check, if it's prime, put it in the list.
        // print the list.

        List<Integer> primeNums = new ArrayList<>();
        CheckPrime obj = new CheckPrime();

        // boolean test = obj.checkPrime(4); // testing my object's method
        // System.out.println(test);

        int i = 3;

        while (i < 1000) {
            if (obj.checkPrime(i) == true) {
                primeNums.add(i);
            }
            i++;
        }

        System.out.println(primeNums);

    }

}

class CheckPrime {
    public boolean checkPrime(int x) {
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }
}