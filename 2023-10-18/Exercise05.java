import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        // 3 sets of variables,
        // make a class called coordinates
        // workout the formula between 2 points in the coordinate class
        // use a ternary to check all three points
        double distanceX1toX2, distanceX2toX3, distanceX1toX3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me x1: ");
        double x1 = scan.nextInt();
        System.out.print("Give me y1: ");
        double y1 = scan.nextInt();
        System.out.print("Give me x2: ");
        double x2 = scan.nextInt();
        System.out.print("Give me y2: ");
        double y2 = scan.nextInt();
        System.out.print("Give me x3: ");
        double x3 = scan.nextInt();
        System.out.print("Give me y3: ");
        double y3 = scan.nextInt();

        PointCoordinate distance = new PointCoordinate();

        distanceX1toX2 = distance.pointDistance(x1, x2, y1, y2);
        distanceX2toX3 = distance.pointDistance(x2, x3, y2, y3);
        distanceX1toX3 = distance.pointDistance(x1, x3, y1, y3);

        double result = (distanceX1toX2 > distanceX2toX3 ? distanceX1toX2 : distanceX2toX3) > distanceX1toX3
                ? (distanceX1toX2 > distanceX2toX3 ? distanceX1toX2 : distanceX2toX3)
                : distanceX1toX3;

        System.out.println("The longest distance is: " + result);

    }
}

class PointCoordinate {
    public double pointDistance(double x1, double x2, double y1, double y2) {
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
        return distance;
    }

}
