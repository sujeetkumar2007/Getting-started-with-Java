import java.util.Scanner;
public class Question5{
    public static void main(String[] args) {
        System.out.println("Enter the unit price: ");
        Scanner scanner = new Scanner(System.in);
        float unitPrice = scanner.nextFloat();
        System.out.println("Enter the quantity: ");
        int quanitity = scanner.nextInt();
        scanner.close();
        float totalPrice = unitPrice*quanitity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f",totalPrice,quanitity,unitPrice);

    }
}