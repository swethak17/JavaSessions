package JavaSessions;

public class Travel {

	public static void main(String[] args) {
		
		Travel e = new Travel();
		e = null;
		
		//Employee e = new Employee();
		//e = null;
		
		//Requesting JVM to call GC;
		
		System.gc();
		System.out.println("Processing Done");

	}
    @Override
	public void finalize(){
		System.out.println("This is my Finalize method");
	}
	
	
}
