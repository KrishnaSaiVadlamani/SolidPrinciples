public class FaxTel extends LandLine implements RouteConnection
{
	@Override
	public void connect()
	{
		System.out.println("sends and receives fax");
	}
}