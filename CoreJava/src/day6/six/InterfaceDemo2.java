package day6.six;

// Single Inheritance[Shape(interface1)-->Rectangle,Shape(interface1)-->Triangle]
interface Shape {
	void draw();
}
class Rectangle implements Shape {
	@Override
	public void draw() {	
		System.out.println("draw Rectangle");
	}
}
class Triangle implements Shape {
	@Override
	public void draw() {	
		System.out.println("draw Triangle");
	}
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		// Here we are creating a referenceVariable-->(shape) for interface-->(Shape)
		Shape shape = null;
		// Using refernceVariable(shape) we are creating object for class-->(Rectangle)
		shape = new Rectangle();
		shape.draw();             
		shape = new Triangle();
		shape.draw();
	}
}
