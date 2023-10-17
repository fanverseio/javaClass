import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CalRectangle cal = new CalRectangle();

        System.out.print("Give us x1: ");
        double x1 = scan.nextDouble();

        System.out.print("Give us y1: ");
        double y1 = scan.nextDouble();

        System.out.print("Give us x2: ");
        double x2 = scan.nextDouble();

        System.out.print("Give us y2: ");
        double y2 = scan.nextDouble();

        System.out.print("Give us x3: ");
        double x3 = scan.nextDouble();

        System.out.print("Give us y3: ");
        double y3 = scan.nextDouble();

        boolean result = (x1 < x3 && x3 < x2) || (y2 < y3 && y3 < y1) ? true : false;

        if (result == true) {
            System.out.println("Overlapped!");
        } else {
            System.out.println("Not overlapped!");
        }
    }

}

class CalRectangle {
    // formula to find area and perimeter:
    // https://youtu.be/9HPWB8UX8GQ?si=9pPWrqc0wePAjvE4
    public double rectangleArea(double x1, double y1, double x2, double y2) {
        double area = Math.abs((x1 - x2) * (y1 - y2));
        return area;
    }

    public double rectanglePerimeter(double x1, double y1, double x2, double y2) {
        double perimeter = 2 * (Math.abs(x1 - x2) + Math.abs(y1 - y2));
        return perimeter;
    }
}
