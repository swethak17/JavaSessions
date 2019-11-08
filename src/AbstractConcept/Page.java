package AbstractConcept;

public abstract class Page {

	//abstract methods and non abstract methods
	// cannot create the object of abstract class
	
	// Abstract class constructor can be called with child class object creation
	public Page(){
		System.out.println("Page Class Constructor......");
	}
	
	public abstract void header();
	public abstract void title();
	
	public final void logout(){
		System.out.println("user logged out");
	}
	
	public static void signup(){
		System.out.println("Page----Signup");
	}
}
