package exercise1;

public class WorkHourSalaryEmployee extends Employee{
	private String name;
	private int hourRate;

	public WorkHourSalaryEmployee(String name, int hourRate) {
		super(name);
		this.hourRate=hourRate;
	}
}
