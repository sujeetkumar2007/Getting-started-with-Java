import java.util.Scanner;
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if(number<0){
            System.out.println("Enter a positive number!");
        }
        else{
            int fact = 1;
            int i = 1;
            while(i<=number){
                fact = fact*i;
                i++;
            }
        System.out.println("The factorial of "+number+" is "+ fact);
        }
        scanner.close();
        }
}
