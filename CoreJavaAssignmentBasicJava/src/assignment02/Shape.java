package assignment02;

public abstract class Shape {
	abstract void draw();
	
	public static void main(String[] args) {
		Shape line = new Line();
		line.draw();
		
		Shape rectangle = new Rectangle();
		rectangle.draw();
		
		Shape cube = new Cube();
		cube.draw();
	}
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing line");
	}	
}

class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
	}
}

class Cube extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing cube");
	}
	
}