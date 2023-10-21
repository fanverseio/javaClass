
public class Exercise04_power {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.print("What is the base: ");
        int base = scan.nextInt();
        System.out.print("What is the exponent: ");
        int exp = scan.nextInt();
        Power object = new Power();
        int result = object.power(base, exp);
        System.out.println(base + "^" + exp + " is " + result + ".");

    }

}

class Power {
    int power(int x, int y) {
        return (int) (Math.pow(Double.valueOf(x), Double.valueOf(y)));
    }
}