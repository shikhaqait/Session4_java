package Framework;

public class Person {

	private int ID;
	private String 	Name, Address;
	
	public int getID()
	{
		return ID;
	}
	public String getName()
	{
		return Name;
	}
	public String getAddress()
	{
		return Address;
	}	
	public void setID(int ID)
	{
		this.ID=ID;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public void setName(String Name)
	{  
		this.Name=Name;
	}  
	
}
