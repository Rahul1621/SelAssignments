package week1.day1;

public class Mobile {
	
	String phoneBrand= "Apple";
	int phoneSize= 123;
	boolean isSmartPhone= true;
	long phNo= 9786219191L;
	int phPrice= 78650;
	char simType='S';
	
	
	public void sendSms() {
		System.out.println("SMS Sent");

	}

	public void makeCall() {
		System.out.println("call connected");

	}
	
	public static void main(String[] args) {
		
		Mobile obj= new Mobile();
		
		obj.sendSms();
		obj.makeCall();
		
		System.out.println(obj.phoneBrand);
		System.out.println(obj.phoneSize);
		System.out.println(obj.isSmartPhone);
		System.out.println(obj.phPrice);
		
		int ps= obj.phoneSize;
		System.out.println(ps);
		
		
		
	}
}
