package AbstractConcept;

public class LoginPage extends Page {

	public LoginPage(){
		System.out.println("Lp...Constructor");
	}
	
	
	@Override
	public void header() {
	System.out.println("LP----Header");
		
	}

	@Override
	public void title() {
		System.out.println("LP-----Title");
		
	}
	public static void signup(){
		System.out.println("Page----Signup");
	}
	
   public HomePage login (String un, String pwd){
   System.out.println("LP----Login");
   System.out.println("Login with " + un + "and" + pwd);
   
   return new HomePage();
   
   
   
   
}
}
