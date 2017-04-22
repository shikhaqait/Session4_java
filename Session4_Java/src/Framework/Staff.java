package Framework;

public class Staff extends Person {
	
	private String Course, Designation;
	private int yearOfJoining, Salary;

	public String getCourse()
	{
		return Course;
	}	
	public void setcourse(String Course)
	{
		this.Course=Course;
	}	
	public String getDesignation()
	{
		return Designation;
	}	
	public void setDesignation(String Designation)
	{
		this.Designation=Designation;
	}	
	
	public int getSalary()
	{
		return Salary;
	}	
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	public int getyearOfJoining()
	{
		return yearOfJoining;
	}	
	public void setyearOfJoining(int yearOfJoining)
	{
		this.yearOfJoining=yearOfJoining;
	}
}
