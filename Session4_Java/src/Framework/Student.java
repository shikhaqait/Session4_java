package Framework;

public class Student extends Person{

  private int Year, fees;
	private String course;
	
	public String getcourse()
	{
		return course;
	}	
	public void setcourse(String course)
	{
		this.course=course;
	}		
	public int getYear()
	{
		return Year;
	}	
	public void setYear(int Year)
	{
		this.Year=Year;
	}
	public int getfees()
	{
		return fees;
	}	
	public void setfees(int fees)
	{
		this.fees=fees;
	}

}
