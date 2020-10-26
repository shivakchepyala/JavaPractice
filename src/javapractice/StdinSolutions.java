package javapractice;

import java.util.Scanner;

public class StdinSolutions {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine(); // gets rid of the pesky newline
		String s = scan.nextLine();
		scan.close();
		
		System.out.println("Standard Integer Input:"+i);
		System.out.println("Standard Double Input:"+d);
		System.out.println("Standard String Input:"+s);
		
	}

}
