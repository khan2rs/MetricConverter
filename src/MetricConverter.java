import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {

        double meters;
        double miles;
        double feet;
        double inches;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the measurement in meters?");
        if (in.hasNextDouble()) {
            meters = in.nextDouble();
            in.nextLine();

            miles = (meters / 1609.344);
            feet = (meters * 3.28084);
            inches = (meters * 39.370079);

            System.out.println("Your value in miles is: " + miles);
            System.out.println("Your value in feet is: " + feet);
            System.out.println("Your value in inches is:" + inches);

        } else {
            trash = in.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }
    }
}
