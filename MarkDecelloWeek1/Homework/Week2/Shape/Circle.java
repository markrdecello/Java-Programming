public class Circle implements Shape{
	private double pi = 3.14;
	private double diameter;

	Circle(double length){
		diameter = length;
	}

	public String getShapeName(){
		return "Circle";
	}

	public double getPerimeter(){
		return pi * diameter;
	}
}
