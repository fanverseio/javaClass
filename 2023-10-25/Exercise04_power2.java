
public class Exercise04_power2 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("What is the exponent: ");
        int exp = scan.nextInt();
        Power object = new Power();
        int result = object.power(exp);
        System.out.println("2^" + exp + " is " + result + ".");

        scan.close();
    }

}

class Power {
    int power(int exp) {
        return (int) (Math.pow(2.0, Double.valueOf(exp)));
    }
}