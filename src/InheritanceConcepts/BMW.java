package InheritanceConcepts;

public class BMW extends Car {
	@Override
   public void start(){
		System.out.println("BMW-----start");
	}
	public void stop(){
		System.out.println("BMW........Stop");
	}
	
	public void autoAirsuspension(){
		System.out.println("BMW-----suspension");
	}
	
	
}
