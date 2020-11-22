package ua.com.pavelsavchenko.carmanager;

public abstract class Car implements Serviceable {
	String brand;
	int perfomanceYear;
	int price;
	int mass;
	Color color;
	private int distance = 0;
	protected int distanceOnService = 0; // protected - доступ для класса и всех его наследников

	public Car(String brand, int perfomanceYear, int price, int mass, Color color) {
		this.brand = brand;
		this.perfomanceYear = perfomanceYear;
		this.price = price;
		this.mass = mass;
		this.color = color;
	}
	void show() {
		System.out.println("brand: " + brand);
		System.out.println("perfomanceYear: " + perfomanceYear);
		System.out.println("price: " + price);
		System.out.println("mass: " + mass);
		System.out.println("color: " + brand);
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", perfomanceYear=" + perfomanceYear + ", price=" + price + ", mass=" + mass
				+ ", color=" + color + ", distance=" + distance + ", distanceOnService=" + distanceOnService + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + distance;
		result = prime * result + mass;
		result = prime * result + perfomanceYear;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (color != other.color)
			return false;
		if (distance != other.distance)
			return false;
		if (mass != other.mass)
			return false;
		if (perfomanceYear != other.perfomanceYear)
			return false;
		if (price != other.price)
			return false;
		return true;
	} // сравнение объектов
	public void addDistance(int addDistant) {
		distance += addDistant;
		distanceOnService += addDistant;
	}
	public void addDistance(float addDistant) {
		distance += addDistant;
		distanceOnService += addDistant;
	}
	
	public int getDistanceOnService() {
		return distanceOnService;
	}
	public void resetDistanceOnService() {
		distanceOnService = 0;
	}
	public int getDistance() {
		return distance;
	}

	
	
	
	
}
