package week1.day2;

import week1.day1.Car;

public class MyCar {
	
	public void soundHorn() {
		System.out.println("Applied horn");

	}

	public static void main(String[] args) {
		
		OwnCar oc= new OwnCar();
		
		oc.applyBrake();
		
		MyCar mc= new MyCar();
		
		mc.soundHorn();
		
		Car cc= new Car();
		
		cc.applyBrake();
		cc.driveCar();
	}

	
}
