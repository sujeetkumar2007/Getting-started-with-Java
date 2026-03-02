import java.util.Scanner;
public class Question10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int combination =  ((numberOfStudents*(numberOfStudents-1))/2);
        System.out.printf("The maximum number of handshakes is %d",combination);
        scanner.close();
    }
}