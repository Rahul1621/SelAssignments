package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		CalculatorNew cc= new CalculatorNew();
		
		int add = cc.add(10, 5, 10);
		System.out.println(add);
		
		int subtract = cc.subtract(10, 30);
		System.out.println(subtract);
		
		int multiplication = cc.multiplication(10, 2);
		System.out.println(multiplication);
		
		

	}

}
