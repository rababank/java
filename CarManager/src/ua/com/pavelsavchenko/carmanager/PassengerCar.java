package ua.com.pavelsavchenko.carmanager;

public class PassengerCar extends Car {

	public PassengerCar(String brand, int perfomanceYear, int price, int mass, Color color) {
		super(brand, perfomanceYear, price, mass, color);
	}
		@Override
		public boolean isReadyToService() {
			if (distanceOnService > 10000)
				return true;
			return false;
		}
	
}
