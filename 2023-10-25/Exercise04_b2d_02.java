public class Exercise04_b2d_02 {

    public static void main(String[] args) {
        String binaryNum = "101011";
        int decimalValue = 0;

        for (int i = 0; i < binaryNum.length(); i++) {
            int digit = binaryNum.charAt(i) - '0';
            decimalValue += digit * Math.pow(2, binaryNum.length() - i - 1);
        }

        System.out.println("Input number: " + binaryNum + " and the decimal value is " + decimalValue);
    }

}
