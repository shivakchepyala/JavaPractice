package javapractice;

//This program is written to convert the temperature
public class CalculateTemperature {

	public static void main(String[] args) {
		float tempInCentigrade;
		int tempInFahrenheit=10;
		/* Formula: (32°F − 32) × 5/9 */
		tempInCentigrade = (tempInFahrenheit - 32) * 5/9;
		System.out.println("Temperature in Centigrade: "+tempInCentigrade);
}
}