import java.util.Scanner;
public class Question4{
    public static void main(String[] args) {
        System.out.println("Enter the distance in feet: ");
        Scanner scanner = new Scanner(System.in);
        float distanceInFeet = scanner.nextFloat();
        float yards = distanceInFeet/3;
        float miles = yards/1760;
        System.out.printf("The distance in yards is %.2f while the distance in miles is %f",yards,miles);
        scanner.close();
    }
}