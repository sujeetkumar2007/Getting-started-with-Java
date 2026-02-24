import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        System.out.print("Enter number 1: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        int add = number1+number2;
        int sub = number1-number2;
        int product = number1*number2;
        double division = (double)number1/number2;
        System.out.printf("The addtion, subtraction, multiplication and division value of the two numbers %d and %d are %d,%d,%d,%.2f",number1,number2,add,sub,product,division);
        scanner.close();
    }
}