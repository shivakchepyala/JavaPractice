package sampleproject01;

class StudentRecord {
	
	private int m1, m2, m3;
	private float percentage;
	
	public StudentRecord()
	{
		m1 = m2 = m3 = 0;
		percentage = 0.0f;
	}
	
	public void calculatePercentage(int x, int y, int z)
	{
		m1 = x; m2 = y; m3 = z;
		percentage = (m1 + m2 + m3)/3.0f;
	}
	
	public void displayPercentage()
	{
		System.out.println("Percentage = " + percentage);
	}
}
