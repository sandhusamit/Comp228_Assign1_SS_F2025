import java.util.Scanner;
public class CurrencyEx {

	Scanner scanner = new Scanner(System.in);
	
	public void Convert()
	{
		double CAD;
		
		System.out.println("Enter Canadian Dollar for USD Conversion: ");
		CAD = scanner.nextDouble();
		double USD = CAD * 0.72;
		
		System.out.printf("As of Sept 13th, 2025 at 11:46AM - %.2f CAD = %.2f USD", CAD, USD);
	}
}