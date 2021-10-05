public class Phone       						
{
    private int phoneNumber;
    private String phoneName;
    
	public void calls()					// single responsibility.
	{
	System.out.println("calls ");
	}
    
    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }

    public void setPhoneName(String phoneName)
    {
    	this.phoneName=phoneName;
    }

    public String getPhoneNumber()
    {
    	return "phone number is "+phoneNumber;
    }

    public String getPhoneName()
    {
    	return "phone name is "+phoneName;
    }

	
}
