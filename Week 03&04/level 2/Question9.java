import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int number = scanner.nextInt();
        int greatestMultiple=1;
        int multiple;
        for(int i=number-1;i>=1;i--){
            if(number%i==0){
                multiple = i;
                if(multiple>greatestMultiple){
                    greatestMultiple = i;
                }
                continue;
            }
        }
        System.out.println("greatest multiple is "+greatestMultiple);
        scanner.close();
    }
}
