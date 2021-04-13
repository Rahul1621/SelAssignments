package week1.day2;

public class Employees {
	
	public void printEmployeeAddress(String empName) {
		
	System.out.println(empName);
	System.out.println("ooty");
	
	}
	
	private void printEmployeePhoneNumber(String empName,int empId ) {
		System.out.println(82433);
		System.out.println(empName);

	}
	
	private String getEmployeeName(int empId) {
		String name;
		
		if(empId==100) {
			name="hari";
		}
		
		else {
			name="NA";
		}
		
		return name;// to give output

	}
	
	public static void main(String[] args) {
		
		Employees emp= new Employees();
		
//		emp.printEmployeeAddress("Rahul");
		
//		emp.printEmployeePhoneNumber("Deepak", 123);
		
		String employeeName = emp.getEmployeeName(200);
		
		System.out.println(employeeName);
		
	}

}
	