public class KeypadGeneric extends Phone implements DigitalPhone,KeypadPhone
{
	String model="keypadV1.0";
	
	@Override
    public void sendsMessage()
	{
     System.out.println("sends sms via sim card services");
	}

	@Override
	public void usesKeys()
	{
		System.out.println("uses keys to navigate");
	}
}