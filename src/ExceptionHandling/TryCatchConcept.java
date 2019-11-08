package ExceptionHandling;

public class TryCatchConcept {
String name = "Tom";
	public static void main(String[] args) {
		TryCatchConcept obj = new TryCatchConcept();
		
		
		System.out.println("A");
		System.out.println("B");
		//JVM will through an exception with the help of:
		//it will create the OBJECT of exception class
		//it will print the exception info with the help of stack trace and exception handler
		try {
			obj = null;
			System.out.println(obj.name);
		int i = 9/0;
		}
		catch (ArithmeticException e){
			System.out.println("some exception occurred.....");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (NullPointerException e1){
			e1.printStackTrace();
		}
		System.out.println("C");
		System.out.println("C");
	
		try {
			int i = 9/0 }
		catch (Exception e){
			
	
	
	}
	
	
	

				
	}

}
