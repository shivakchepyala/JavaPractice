package classesandobjectsproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rectangle {
	
	private int len, brd;
	
	public void getData() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length and breadth");
		len=Integer.parseInt(br.readLine());
		brd=Integer.parseInt(br.readLine());
	}
	
	public void setData(int l, int b) {
		len=l;
		brd=b;
	}
	
	public void displayData() {
		System.out.println("length="+len);
		System.out.println("breadth="+brd);
	}
	
	public void areaPeri() {
		int a, p;
		a = len * brd;
		p = 2*(len+brd);
		System.out.println("area="+a);
		System.out.println("perimeter="+p);
	}

}
