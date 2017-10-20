package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{
	private String name;
	private int baseSalary;
	private int commission;

	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		super(name);
		this.baseSalary=baseSalary;
		this.commission=commission;
	}
}
