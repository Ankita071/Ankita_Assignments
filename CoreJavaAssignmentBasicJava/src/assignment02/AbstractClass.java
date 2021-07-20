package assignment02;

//	public class AbstractClass {           //1.) This line will show error if a method inside it will be abstract.
//private abstract class AbstractClass {    //4.) This will show error as abstract class cannot be private.
//public final abstract class AbstractClass {    //5.) This will show error as abstract class cannot be final.

public abstract class AbstractClass {
	abstract public void oneMethod();
	abstract public void anotherMethod();
		
	public static void main(String[] args) {
//		AbstractClass ac = new AbstractClass();   //2.) This will show error as abstract method cannot be instantiated.
		AbstractClass ac = new anotherClass();
		ac.oneMethod();
		ac.anotherMethod();
	}
}

// 3.) Overriding all the methods in sub-class
class anotherClass extends AbstractClass {
	@Override
	public void oneMethod() {
		System.out.println("Printing first method.");
	}
	
	@Override
	public void anotherMethod() {
		System.out.println("Printing second method.");
	}	
}

// 6.) Declaring an abstract class without abstract methods.
abstract class differentClass {
	public void differentMethod() {
		System.out.println("Printing different class");
	}
}

// 3.) Declaring subclass as abstract because all the methods in base class are not overrided in this subclass.
//abstract class anotherClass extends AbstractClass {
//	@Override
//	public void oneMethod() {
//		System.out.println("Printing first method.");
//	}
//}