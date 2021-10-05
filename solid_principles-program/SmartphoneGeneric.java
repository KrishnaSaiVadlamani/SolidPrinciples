public class SmartphoneGeneric extends Phone implements DigitalPhone,TouchPhone,SmartPhone
{
	String model="SmartphoneV1.0";

	@Override
	public void sendsMessage()
	{
     System.out.println("sends sms via sim card or texts via apps");
	}

	@Override
    public void usesTouchScreen()
    {
    	System.out.println("uses touchscreen to navigate");
    }

    @Override
    public void runsMultipleApps()
    {
    	System.out.println("runs multiple apps at once");
    }

    @Override
    public void runsHighEndGames()
    {
    	System.out.println("running high end games");
    }

    @Override
    public void gps()
    {
    	System.out.println("gps/location services running");
    }
}