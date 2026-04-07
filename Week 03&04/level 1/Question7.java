import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        System.out.println("Enter the month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Enter the date: ");
        int date = scanner.nextInt();
        if((month==3&&date>=20)|| (month ==4)|| (month == 5)||(month==6&&date<=20)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}
