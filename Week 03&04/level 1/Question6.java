import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%2==0){
            System.out.println("The number is even.");
        }
        else if(number==0){
            System.out.println("The number is zero.");
        }
        else{
            System.out.println("The number is odd.");
        }
        scanner.close();
    }
    
}
