import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        System.out.print("Enter your height in cm: ");
        Scanner scanner = new Scanner(System.in);
        double height = scanner.nextDouble();
        scanner.close();
        double heightInches = height/2.54;
        double heightFoot = heightInches/12;
        System.out.printf("Your height in cm is %.2f while in feet is %.2f and inches is %.2f",height,heightFoot,heightInches);


    }
    
}
