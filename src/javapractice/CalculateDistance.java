package javapractice;

//Calculating distance for given Kilometre between two cities
public class CalculateDistance {

	public static void main(String[] args) {
		int distanceBwCitiesInKms = 60;
		float distanceInMeters, distanceInCentimeters, distanceInFeet, distanceinInches;
		final int oneKmToMeter = 1000;
		final int oneKmToCentimeters = 100000;
		final float oneKmToFeet = 3280.84f;
		final float oneKmToInches = 39370.1f;
		System.out.println("Execution Started\n");
		distanceInMeters = distanceBwCitiesInKms * oneKmToMeter;
		System.out.println("Distance Between Cities In Meters: "+distanceInMeters+"\n");
		distanceInCentimeters = distanceBwCitiesInKms * oneKmToCentimeters;
		System.out.println("Distance Between Cities In Centimeters: "+distanceInCentimeters+"\n");
		distanceInFeet = distanceBwCitiesInKms * oneKmToFeet;
		System.out.println("Distance Between Cities In Feet: "+distanceInFeet+"\n");
		distanceinInches = distanceBwCitiesInKms * oneKmToInches;
		System.out.println("Distance Between Cities In Inches: "+distanceinInches+"\n");
		System.out.println("Execution Finished");
		
		

	}

}
