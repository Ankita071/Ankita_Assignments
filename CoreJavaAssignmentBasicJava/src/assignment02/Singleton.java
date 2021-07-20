package assignment02;

public class Singleton {
	private static Singleton inst = null;
	
	public String mssge;
	
	private Singleton()
    {
        mssge = "Hello";
    }
	
	 public static Singleton getInstance()
	 {
		 if (inst == null)
	            inst = new Singleton();
	  
	     return inst;
	 }
	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
		
		System.out.println(singleton1.mssge);
		System.out.println(singleton2.mssge);
		singleton2.mssge = "Hello World";

		System.out.println(singleton2.mssge);
		System.out.println(singleton3.mssge);

		System.out.println(singleton1.mssge);
	}

}
