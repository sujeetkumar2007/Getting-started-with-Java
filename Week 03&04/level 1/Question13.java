import java.util.Scanner;
public class Question13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("The number is not natural");
        }
        else{
            System.out.println("The number is natural");
        }
        int loopsum =0;
        int i;
        for(i=1;i<=n;i++){
            loopsum+=i;
        }
        
        System.out.println("The loopsum is : "+loopsum);
        int sum = n*(n+1)/2;
        System.out.println("The formulasum is: "+sum);
        if(sum == loopsum){
           System.out.println("The sums are equal");;
        }
        scanner.close();
    }
}
