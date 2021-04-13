package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input=10;
		
		int count=0;
		
		for (int i = 1; i <=13; i++) {
			
			if(input%i==0) {
				count= count+1;
			}
			
		}
		if (count==2) {
			System.out.println("given number is prime");
		}
		
		else {
			System.out.println("given number is not prime");
		}
	}
	

}
