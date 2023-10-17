import java.util.Scanner;

public class Exercise06 {
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

        double area = cal.rectangleArea(x1, y1, x2, y2);
        double perimeter = cal.rectanglePerimeter(x1, y1, x2, y2);

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
        scan.close();

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
