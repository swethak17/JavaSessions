package JavaSessions;

import java.security.PublicKey;

public class AssignUniv {
	String name;
	String Country;
	String establisheddate;
	String [] Courses;
	
	public AssignUniv(){
		System.out.println("Default Parameter");
	}
		public AssignUniv(String name){
		System.out.println("1 parameters.........." + name);
	}
		public AssignUniv(String name, String Country){
		System.out.println("2 Parameters....." + name + Country);
	}
		public AssignUniv(String name, String Country, String establisheddate,
			String[] Courses) {
		this.name = name;
		this.Country = Country;
		this.establisheddate = establisheddate;
		this.Courses = Courses;
	}
  	 	public static void main(String[] args) {
		AssignUniv u1 = new AssignUniv();
		AssignUniv u2 = new AssignUniv("Sanford");
		AssignUniv u3 = new AssignUniv("Sanford" , " California USA");
		
		AssignUniv us4 = new AssignUniv("sanford , CA USA , 1900 feb , engineering");
		AssignUniv us5 = new AssignUniv("MIT , CA USA , 1950 May , Computer Science");
		AssignUniv us6 = new AssignUniv("NYU , CA USA , 1850 Nov , Research");
		AssignUniv us7 = new AssignUniv("SFU , CA USA , 1900 April , Business Administration");
				
	}

	
	
	
	

}
