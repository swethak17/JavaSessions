package JavaSessions;

public class AssignmentMethods {
	
	//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	public int add(int n1, int n2){
		System.out.println("Add Method : ");
		int c = n1+n2;
		return c; 	}
	
	//2.Define a method that returns the product of two numbers entered by user.
	public int multiple (int n1, int n2){
		System.out.println("The Product of two number: ");
		int z = n1*n2;
		return z;
	}
	
	//3.Write a program to print the circumference and area of a circle of radius entered
	//by user by defining your own method.
	public double circumcircle(double d , double r, double c){ //d=1.05;r=0.5,c=3.14)
				double cc = d*r*c;//circumference of circle
		double cr = c*r*r;
	return cc+cr;}
	
	
	//4. Define two methods to print the maximum and the 
	//minimum number respectively among three numbers entered by user.
	
	public  int maxmandmin(int m1, int  m2, int  m3){
		
										
		System.out.println("The Largest number of the two numbers is " + Math.max(m1,m2));
		System.out.println("The smallest number of the two numbers is " + Math.min(m1,m2));
		return m3;
		
		
	}
	
	public static void main(String[] args) {
		String a = args[0];
		String b = args[1];
		//Convering String to Int
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		int sum = add(num1, num2);
		System.out.println("Sum of 2 Numbers are:"+sum);
		int prod = multiple(num1, num2);
		System.out.println("Prod of 2 numbers are:"+prod);
		
	}
	
}

