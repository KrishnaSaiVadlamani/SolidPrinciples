public class Test
{
	public static void main(String[] args) 
	{
		DigitalPhone digitalPhoneInstance1=new SmartphoneGeneric();
		digitalPhoneInstance1.sendsMessage();

		DigitalPhone digitalPhoneInstance2=new KeypadGeneric();
		digitalPhoneInstance2.sendsMessage();                      // dependency inversion
        
		Phone phoneInstance1=new Phone();
        phoneInstance1.setPhoneNumber(576833);
        phoneInstance1.setPhoneName("BasicV1.0");

        phoneInstance1.calls();
        System.out.println(phoneInstance1.getPhoneName());
        System.out.println(phoneInstance1.getPhoneNumber());

	    phoneInstance1=new LandLine();						// liskov substitution              
        phoneInstance1.setPhoneNumber(23536445);
       

        phoneInstance1.calls();
        System.out.println(phoneInstance1.getPhoneNumber());

        ConnectToSource connection=new ConnectToSource();
        FaxTel phoneInstance3=new FaxTel();
        connection.serve(phoneInstance3);
	}
}