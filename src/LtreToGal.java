import java.util.Scanner;
public class LtreToGal {

	Scanner sc = new Scanner(System.in);
	
	public void Convert()
	{
		double litres;
		
		System.out.println("Enter Litres to convert to gallons: ");
		litres = sc.nextDouble();
		double gallons = litres / 3.785;
		
		System.out.printf("%f Litres = %f US Liquid Gallons", litres, gallons);
	}
}
