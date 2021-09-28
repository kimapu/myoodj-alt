package solution.tut3.demo;

import java.awt.Color;

public class Fan {

	private final int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan( int speed ) {
		this.speed = speed;
	}

	public Fan(int speed, boolean on, double radius, Color color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color.toString();
	}

	public String getSpeed() {
		String speedWord = "";
		switch (this.speed) {
		case 1: 
			speedWord = "SLOW";
			break;
		case 2: 
			speedWord = "MEDIUM";
			break;
		case 3: 
			speedWord = "FAST";
			break;
		
		default:
			speedWord = "";
		}
		return speedWord;
	}
	
	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color.toString();
	}

	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
	}

}
