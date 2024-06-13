package com.test;

import com.vehicles.Vehicle;
import com.vehicles.Car;
import com.vehicles.Truck;

public class Main {
	public static void main(String[] args) {

		Vehicle vr =  new Vehicle("sanjay", "volvo");
		vr.displayDetails();

		Car cr =  new Car("11-06-204", "volvo", 4);
		cr.displayDetails();

		Truck tr =  new Truck("sanjay", "volvo", "pay this");
		tr.displayDetails();

		
		

}
}