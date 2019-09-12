//Mark Decello
//Homework 2
//Week 2
//Problem 2

public class Main{
	public static void main(String[] args){
		Shape triangle = new Triangle(3, 4, 5);
		System.out.println("Getting perimeter... " + String.valueOf(triangle.getPerimeter()));
		System.out.println("Getting shape name... " + triangle.getShapeName() + "\n");

		Shape circle = new Circle(29);
		System.out.println("Getting perimeter... " + String.valueOf(circle.getPerimeter()));
		System.out.println("Getting shape name... " + circle.getShapeName() + "\n");

		Shape square = new Square(9);
		System.out.println("Getting perimeter... " + String.valueOf(square.getPerimeter()));
		System.out.println("Getting shape name... " + square.getShapeName() + "\n");

		Shape rectangle = new Rectangle(5, 7);
		System.out.println("Getting perimeter... " + String.valueOf(rectangle.getPerimeter()));
		System.out.println("Getting shape name... " + rectangle.getShapeName());
	}
}
