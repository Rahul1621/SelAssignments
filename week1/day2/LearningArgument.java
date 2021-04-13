package week1.day2;

public class LearningArgument {

	private void printEmployeeAddress(String empName) {
		System.out.println(empName);

	}
	
	private void printEmployeeNumber(String empName, int empId) {
		System.out.println(empName);
		System.out.println(empId);

	}
	
	
	private String getEmployeeName(int empId) {
		
		String name;
		
		if (empId==100) {
			name="Velu";
		}
		else {
			name="Not applicable";
		}
		
		return name;
		
			
	}
	
	public static void main(String[] args) {
		
		LearningArgument la= new LearningArgument();
		
//		la.printEmployeeAddress("Rahul");		
//		la.printEmployeeNumber("Deepak", 200);
		
		String employeeName = la.getEmployeeName(200);
		
		System.out.println(employeeName);
	}
	
	

}
