import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] < 0) {
                i--;
                continue;
            }

            personData[i][1] = sc.nextDouble();
            if (personData[i][1] < 0) {
                i--;
                continue;
            }
        }

        for (int i = 0; i < n; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + " " + personData[i][0] + " " + personData[i][2] + " " + weightStatus[i]);
        }
        sc.close();
    }
}