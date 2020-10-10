package javapractice;

//Calculating the gross salary
public class CalGrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int basicSalary, dearnessAllowance, houseRentAllowance, grossSalary;
		basicSalary = 25000;
		dearnessAllowance = basicSalary*40/100;
		houseRentAllowance = basicSalary*20/100;
		grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;
		System.out.println("Dearness Allowance: "+dearnessAllowance);
		System.out.println("House Rent Allowance:"+houseRentAllowance);
		System.out.println("Gross Salary: "+grossSalary);
		

	}

}
