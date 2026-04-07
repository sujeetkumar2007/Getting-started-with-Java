import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int n = scanner.nextInt();
        if(n>0&&n<=100){
            System.out.println("The multiples are: ");
            for(int i=100;i>=1;i--){
                if(n%i==0){
                    System.out.println(i);
                    continue;
                }
            }
        }
        else{
            System.out.println("Enter a positive number!");
        }
        scanner.close();
    }
}
