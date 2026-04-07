import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("Enter the power: ");
        int power = scanner.nextInt();
        int temp = 0;
        int result = 1;
        while(temp<power){
        result = result*number;
        temp++;
        }
        System.out.println("The result is "+result);
        scanner.close();
    }
}
