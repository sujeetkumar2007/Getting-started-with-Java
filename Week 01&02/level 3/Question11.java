import java.util.Scanner;
public class Question11 {
    public static void main(String[] args) {
        System.out.println("Enter the weight in kgs: ");
        Scanner scanner = new Scanner(System.in);
        float weight = scanner.nextFloat();
        float pound = weight/2.2f;
        System.out.printf("The weightof the person in pound is %.2f and in kg is %.2f",pound,weight);
    }
}
