package JavaSessions;

public class Employee {

	//data member : Class members
	//Class variables
	//Class methods
	
	String name;
	int age;
	char gender;
	boolean ispermanent;
	
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.gender = 'm';
		e1.ispermanent = true;
		
		System.out.println(e1.name+ " "+e1.age+ " " + e1.gender+ " " + e1. ispermanent);
		
		Employee e2 = new Employee();
		e2.name = "Nadeem";
		e2.age = 26;
		e2.gender = 'm';
		e2.ispermanent = true;
		System.out.println(e2.name+" "+e2.age+"  "+e2.gender+" "+e2.ispermanent);
		
		Employee e3 = new Employee();
		e3.name = "Anusha";
		e3.age = 23;
		e3.gender = 'f';
		e3.ispermanent = false;
		System.out.println(e3.name+" " + e3.age+ " " + e3.gender+" "+ e3.ispermanent);
		
		
		//new Employee().name = "Alex";
		//new Employee().age = 35;
		
		//System.gc();
		
		//e3 = null;
		e1=e2;
		e2=e3;
		e3=e1;
		
		
				

	}

}
