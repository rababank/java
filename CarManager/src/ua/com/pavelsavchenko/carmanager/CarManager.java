package ua.com.pavelsavchenko.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
		PassengerCar car1 = new PassengerCar("Toyota", 2012, 20000, 2000, Color.BLACK);
		Bus car2 = new Bus("Marcedes", 2015, 25000, 2500, Color.WHITE);
		Bus car3 = new Bus("Mazda3", 2010, 25000, 2500, Color.WHITE);
		System.out.println();
		//car1.show();
		car1.addDistance(10001);
		car2.addDistance(10001);
		car3.addDistance(10001);
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car1.isReadyToService());
		System.out.println(car2.isReadyToService());
		System.out.println(car3.isReadyToService());
		
		List<Car> arrCar = new ArrayList<Car>();
		arrCar.add(car1);
		arrCar.add(car2);
		arrCar.add(car3);
		System.out.println(arrCar);
		//System.out.println(car3.equals(car2));
	}

}
