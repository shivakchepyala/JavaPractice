package constructorsproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Number {
	
	private int i;
	
	public void setData(int j) {
		i=j;
	}
	
	public void getData() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any integer");
		i = Integer.parseInt(br.readLine());
	}
	
	public Number() {
		// Zero argument constructor
	}
	
	//One argument constructor
	public Number(int j)
	{
		i=j;
	}
	
	public void displayData() {
		System.out.println("Value of i="+i);
	}
	
}
