
public class Exercise04_power2 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.print("What is the exponent: ");
        int exp = scan.nextInt();
        Power object = new Power();
        object.setX(2);
        int result = object.power(exp);

        Power object2 = new Power();
        object2.setX(10);
        int result2 = object2.power(exp);

        System.out.println("2^" + exp + " is " + result + ".");

        Power.printHello("George")

        scan.close();
    }

}

class Power {
    int x;

    int power(int exp) {
        return (int) (Math.pow(x, Double.valueOf(exp)));
    }

    void setX(int y) {
        x = y;
    }

    int getX() {
        return x;
    }

    static void printHello(String name) {
        System.out.println("Hello "+name);
    }
}