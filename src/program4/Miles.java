package program4;

public class Miles {

    private static double hours;

	public static void main(String[] strings) {

        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;
        double distanceInKilometers = distanceInMiles * 1.60934;
		double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;
        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println(kilometersPerHour);

    }
}