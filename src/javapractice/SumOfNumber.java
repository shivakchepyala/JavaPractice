package javapractice;

public class SumOfNumber {

	public static void main(String[] args) {
		int num=8888;
		int count=0;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			count++;
		}
		System.out.println("Number of digits: "+count);
		System.out.println("Sum of number: "+sum);


	}

}
