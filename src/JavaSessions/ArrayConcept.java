package JavaSessions;

public class ArrayConcept {
	
	//size is fixed ; can be solved by dynamic array
	//can store only similiar type of data : can be solved by static object array

	public static void main(String[] args) {
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
	
		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[1]+ i[2]);
		
		for (int k=0; k<=i.length-1; k++){
			System.out.println(i[k]);
		}
			
	
	//double array
	double d[] = new double [3];
		System.out.println(d.length);
	d[0] = 12.33;
	d[1] = 100;
	d[2] = 15.55;
	System.out.println(d[0]+"test"+d[2]);
	
	//string array
		String names[] = new String [3];
		names [0] = "Nikhil";
		names [1] = "Naveen";
		names [2] = "Anitha";
		
	 System.out.println(names[1]);
      for (int n=0; n <names.length; n++)
      {System.out.println(names[n]);}

//object array
      Object emp[] = new Object [5];
      emp [0]= "Kumar";
      emp[1]= 20;
      emp [2] ='m';
      emp [3] = true;
      emp [4]= 5.5;
      
      System.out.println(emp[4]);
      for (int count = 0; count< emp.length;count++)
      {System.out.println(emp[count]);}
Object cric[] = new Object[7];
cric [0] = "Sachin";
cric [1] = 40;

}
}
	
		
	


