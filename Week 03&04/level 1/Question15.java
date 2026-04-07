import java.util.Scanner;
public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int i;
        int fact=1;
        for(i=1;i<=number;i++){
             fact = fact *i;
            }
        System.out.println("The factorial of the number "+number+" is "+ fact);
        scanner.close();
    }
}
