import java.util.Scanner;

public class MilesToKm {

	Scanner scanner = new Scanner(System.in);
	
	public void Convert()
	{
		double miles;
		double km;
		System.out.println("Enter Miles to convert to KM: ");
		miles = scanner.nextDouble();
		
		km = miles * 1.609;
		
		System.out.printf("%f Miles = %f KM", miles, km);
		
	}
}
