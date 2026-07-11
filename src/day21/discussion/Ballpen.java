package day21.discussion;

public class Ballpen {
	
	// Initialize variables
	private int id;
	private String brand;
	private String color;
	private double price;
	private double pointSize;
	
	// Setter methods / mutator methods
	public void setID(int id) {
		this.id = id;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setPointSize(double pointSize) {
		this.pointSize = pointSize;
	}
	
	// Getter methods / accessor methods
	public int getID() {
		return id;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPointSize() {
		return pointSize;
	}
}
