package ExceptionHandling;

public class FinallyConcept {

	public static void main(String[] args) {
		
		
		System.out.println("A");
		
		try {
		int i = 9/3;
	}
		//connect to DB
		//get the data from DB----Exception is coming
		
		catch (Exception e){
			System.out.println("Some ex is coming");
		}
		finally {
			System.out.println("Disconnect the DB");
		}
			System.out.println("Run this line.....");
		}

}
