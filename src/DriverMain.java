
public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeCalculation gradeCalc = new GradeCalculation();
		MilesToKm milesConvert = new MilesToKm();
		LtreToGal litresConvert = new LtreToGal();
		CurrencyEx CADUSD = new CurrencyEx();

		//Question 1
		gradeCalc.GradeCalc();
		
		//Question 2
		milesConvert.Convert();
		
		//Question 3
		litresConvert.Convert();
		
		//Question 4
		CADUSD.Convert();
		
		

	}

}
