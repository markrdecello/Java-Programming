public class Rectangle implements Shape{
	private double side1;
	private double side2;

	Rectangle(double length1, double length2){
		side1 = length1;
		side2 = length2;
	}

	public String getShapeName(){
		return "Rectangle";
	}

	public double getPerimeter(){
		return (2 * side1) + (2 * side2);
	}
}
