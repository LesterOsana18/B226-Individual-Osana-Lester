package day17.activity;

public class Laptop {
	
	// Fields (attributes) that describe a Laptop object
	String brand;
	String build;
	String color;
	int memory;
	int size;
	
	// Methods (behaviors) that represent what a Laptop can do
	public void study() {
		System.out.println("It's time to study!");
		System.out.println("Entering STUDY mode...");
		System.out.println("Opening your usual IDE...");
	}
	
	public void watch() {
		System.out.println("It's time to watch a movie!");
		System.out.println("Entering WATCH mode...");
		System.out.println("Launching media player...");
	}
	
	public void game() {
		System.out.println("It's time to play a game!");
		System.out.println("Entering GAME mode...");
		System.out.println("Launching your favorite game...");
	}
	
	public void work() {
		System.out.println("It's time to work!");
		System.out.println("Entering WORK mode...");
		System.out.println("Opening productivity tools...");
	}
	
	public void displayInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Build : " + build);
		System.out.println("Color : " + color);
		System.out.println("RAM   : " + memory + " GB");
		System.out.println("Size  : " + size + "\"");
	}
}
