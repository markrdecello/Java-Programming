public class Square implements Shape{
	private double side;

	Square(double length){
		side = length;
	}

	public String getShapeName(){
		return "Square";
	}

	public double getPerimeter(){
		return 4 * side;
	}
}
