import java.util.Scanner;
public class Question1{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
            System.out.println(i+" is even");
            } 
            else{
                System.out.println(i+" is odd");
        }
        }
    scanner.close();
}
}