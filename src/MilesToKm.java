import java.util.Scanner;

public class MilesToKm {
    

    public void Convert() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Miles to convert to KM: ");

        if (scanner.hasNextDouble()) {
            double miles = scanner.nextDouble();
            double km = miles * 1.609;
            System.out.printf("%.2f Miles = %.2f KM%n", miles, km);
        } else {
            System.out.println("Invalid input! Please enter a number.");
        }
        
        
    }
}
