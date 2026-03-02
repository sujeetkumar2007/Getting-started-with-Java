import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        System.out.println("Enter the temperature in celsius: ");
        Scanner scanner = new Scanner(System.in);
        float celsius = scanner.nextFloat();
        float farenheitResult = (celsius*9/5) +32;
        System.out.printf("The %.2f celsius is %.2f farenheit",celsius,farenheitResult);
        scanner.close();
    }
}