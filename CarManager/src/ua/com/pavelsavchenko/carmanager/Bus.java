package ua.com.pavelsavchenko.carmanager;

public class Bus extends Car {

	public Bus(String brand, int perfomanceYear, int price, int mass, Color color) {
		super(brand, perfomanceYear, price, mass, color);
		int probeg;
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public boolean isReadyToService() {
		if (distanceOnService > 50000)
			return true;
		return false;
	}

}
