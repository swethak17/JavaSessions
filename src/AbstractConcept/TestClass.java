package AbstractConcept;

public class TestClass {

	public static void main(String[] args) {
		
		Page.signup();
		
		LoginPage lp = new LoginPage();
		lp.header();
		lp.title();
		HomePage hp = lp.login("admin","admin");
		hp.header();
		hp.title();
		hp.userdetails();
		
		hp.logout();
		
		
		Page p = new LoginPage();
		Page p1 = new HomePage();
		
		p.header();
		p.title();
		p.logout();
		
	}

}
