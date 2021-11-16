package solution.tut8.all;

public class MileKmConverter {

	public static double toKM(String mile) throws NumberFormatException
	{
		return Double.parseDouble(mile) * 1.60934;
	}
	
	public static double toMile(String kilometer) throws NumberFormatException
	{
		return Double.parseDouble(kilometer) * 0.621371;
	}
	
}
