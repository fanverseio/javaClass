
public class Exercise03 {

    static int compute(int input) { // creating static method called compute(input) input is an integer.
        int result = 1; // instantiate result which is 1
        for (int i = 0; i < input; i++) { // it takes in a an integer number, and when run the loop i times, until i is
                                          // smaller than the input
                                          // for example if input is 5 then the for loop will run 4 times, if
                                          // input is 3, the for loop will run 2 times.
            if (i % 2 == 1) { // when i is an odd number, result = result + 1
                result++;
            } else {
                result += helper(i); // when i is an even number, it called the helper methods and result is equal to
                                     // helper(i) when helper is called, it reutrns the sum of 2 * i = 1 so when i is
                                     // an even number, say 2, result will be result + 2 * 2 + 1, so it'll be result
                                     // + result + 5
            }
        }
        return result;
    }

    static int helper(int x) { // helper method for
        int r = 2 * x + 1;
        return r;
    }

    public static void main(String[] args) {
        System.out.print("Hello! Please enter an int value: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int input = sc.nextInt();
        int res = compute(input); // calling the compute(input) methods if input is -1
        System.out.println("Result: " + res);
    }
}
