package sampleproject02;

class Sample {
	
	public static int d, m, y;
	
	static
	{
		d = m = y = 10;
	}

	public Sample()
	{
		d++; m++; y++;
	}
	
	public static void Show() {
		System.out.println("y: "+y);
		System.out.println("m: "+m);
		System.out.println("d: "+d);
	}
}
