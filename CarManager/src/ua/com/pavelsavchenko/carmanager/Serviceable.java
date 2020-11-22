package ua.com.pavelsavchenko.carmanager;

public interface Serviceable {
	public  boolean isReadyToService();
	public int getDistanceOnService();
	void addDistance(int addDistant);
	void addDistance(float addDistant);
}
