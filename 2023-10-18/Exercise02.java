
// Look at the following code. What does it do? What will it print on the screen?
// 1 double d1 = 1.255;
// 2 double d2 = d1 + 7 - 4 - 3;
// 3 if (d1 == d2) {
// 4 System.out.println("1.255 is equal to 1.255 plus 7 minus 7");
// 5 } else {
// 6 System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7");
// 7 }

// when mixing variable types, integers are being converted to double for the arithmetic operations. So d2 = d1 + 7 - 4 - 3 == d2 = d1 + 7.0 - 4.0 - 3.0

public class Exercise02 {

    public static void main(String[] args) {
        double d1 = 1.255;
        double d2 = 1.255;

        if (d1 == d2) {
            System.out.println("1.255 is equal to 1.255 plus 7 minus 7.");
            System.out.println("d1=" + d1 + "; d2=" + d2);

        } else {
            System.out.println("1.255 is NOT equal to 1.255 plus 7 minus 7.");
            System.out.println("d1=" + d1 + "; d2=" + d2);
        }

    }
}
