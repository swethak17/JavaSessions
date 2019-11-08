package JavaSessions;

public class EmployeeTest {

	public static void main(String[] args) {
		EmployeeData e1 = new EmployeeData("Alex", 2 , 26 , "Admin",2000);
		System.out.println(e1.name);
		
		e1.Employeename();
		e1.getEmployeeBonus();
		e1.setSalary(5000);
		System.out.println(e1.getSalary());
	}

}
