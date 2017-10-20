package exercise1;

public class FixedSalaryEmployee extends Employee{
	private String name;
	private int fixedSalary;

	public FixedSalaryEmployee(String name,int fixedSalary) {
		super(name);
		this.fixedSalary=fixedSalary;
	}
}
