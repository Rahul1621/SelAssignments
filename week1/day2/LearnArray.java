package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
//		Similar type of data type can be saved in single array
		
// 		We cannot change the array size at runtime
		
//		All values are stored within index, always first data index is zero,  the last data index size of array-1
		
		int [] num= new int [5];
		
//		num[0]=10;  // First index starts with zero
//		num[1]=60;
//		num[2]=20; 
//		num[3]=40;
//		num[4]=15;// last index is size of array -1
		
		int[] num1= {10,20,30,8};
		
//		System.out.println(num.length);// to find the size of the array
//
//		System.out.println(num.length-1); // to identify last data index the length-1
//
//		System.out.println(num[1]); // to get single value from array
//		
//		System.out.println(num[num.length-1]);// to get last data
		
// 		to get all the value in the array we have to use for loop
		
//		for (int i = 0; i < num.length; i++) {
//			
//			System.out.println(num[i]);
			
// 		to get the data in reverse order
		
//			
//			for (int i = num.length-1; i >=0; i--) {
//				
//				System.out.println(num[i]);
//				
// To sort the array 
		
	Arrays.sort(num1);
	
	for (int i = 0; i < num1.length; i++) {
	
		System.out.println(num1[i]);			
		
// Advance for loop
//		
//		for (int i : num1) {
//			System.out.println(i);
			
		}
			
		}
		
	}
	
	


