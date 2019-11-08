package JavaSessions;

public class EmployeeData {
	public String name;
	public int id;
	public int age;
	public String dept;
	private int Salary;
	
	
	
  public EmployeeData(String name, int id, int age, String dept, int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.dept = dept;
		Salary = salary;
	}

public void Employeename(){
	  System.out.println("Get Employee Name");
	  getEmployeeBonus();
}

  
  private void EmployeeBonus(){
	  System.out.println("Get Employee Bonus");
  }
	public int getSalary(){
		return Salary;
	}
	
	public void setSalary(int Salary){
		this.Salary = Salary;
	}
	
	
	public static void main(String[] args) {
		
		EmployeeData e1 = new EmployeeData("Tom",100,25,"IT",50000);
		System.out.println(e1.name);
		System.out.println(e1.Salary);
		e1.getEmployeeName();
		e1.getEmployeeName();
		
		
		
	}

	private void getEmployeeName() {
		// TODO Auto-generated method stub
		
	}

}
