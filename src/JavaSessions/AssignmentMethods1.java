package JavaSessions;

public class AssignmentMethods1 {
  public static void main(String[] args) {
		AssignmentMethods1 obj = new AssignmentMethods1();
		//1.add method
		int add = obj.add(10,20);
		System.out.println(add);
		
		//2.Product of two
		int product = obj.product(4, 2);
		System.out.println(product);
		
		//3.Circumference and area of circle
		double cc = obj.cc(1.05,0.5,2);
		System.out.println("Circumference of circle: "+ cc);
		double cr = obj.cr(0.5,2);
		System.out.println("Area of circle of radius     "+ cr);
		
		
		//4.maxnumlist and minmumlist
  
  //       int maxnumlist = obj.maxnumlist(67, 30, 67, 55);
    //     System.out.println("Greatest number is : ");
         
      //   int minmumlist = obj.minmumlist(20, 65, 87);
        // System.out.println("Minimum number is : ");
		
       //5. Even odd numbers
		int Evenodd = obj.Evenodd(5);
		System.out.println(Evenodd);
		
		//6.Voter age 18
		int age = obj.age(19);
		System.out.println(age);
		
		//7.primenumber
		boolean primenum = obj.primenum(7);
		System.out.println(primenum);
		
		//8. Marks - grade
		int marks = obj.marks(70);
		System.out.println(marks);
		
		//9.factorial 
		int fact = obj.fact(5);
		System.out.println(fact);
	}

	//1.Write a program to print the sum of two numbers entered by user by defining your own method.
	public int add(int a,int b){
		System.out.println("Add Method: " );
	int c = a+b;
	return c;
}
	//2. Define a method that returns the product of two numbers entered by user.
	
	public int product(int x, int y){
		System.out.println("Product of two numbers");
		int z = x*y;
		return z;
			}
	//3.write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	public double cc(double d, double r, double c){
		double cc = d*r*c; //circumference of circle
		return cc;}
	public double cr (double c, double r){
	double cr = c*r*r; // Area of circle of radius
		return cr;
	}

	//4.Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	public int maxnumlist(int n1, int n2, int n3){
		if (n1>n2 && n1>n3)
			return n1;
			System.out.println(n1 + " is the largest number.");
			 if(n2 > n3 && n2>n1)
             System.out.println(n2 + " is the largest number.");
         return n2;
          if (n3 > n1 & n3 > n2)
        	    System.out.println(n3 + " is the largest number.");}
			
	public int minmumlist(int x,  int y, int z){
		
		if (x > y && x > z)
		      System.out.println("First number is largest.");
		    else if (y > x && y > z)
		      System.out.println("Second number is largest.");
		    else if (z > x && z > y)
		      System.out.println("Third number is largest.");
		    else
		      System.out.println("The numbers are not distinct.");}
		//return ; 	}
	
//5. Define a program to find out whether a given number is even or odd.
	
	public int Evenodd(int m){
		if (m % 2 == 0)
            System.out.println(m + " is even");
        else
            System.out.println(m + " is odd");
		return m;}

//6.A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public int age(int a){
      if (a >= 18)
    	 System.out.println("Eligible to Vote");
    		 else 
    			 System.out.println("Not Eligible to vote as age is below 18");
    	       
      	 return a;}
    
    
   //7.Define a method to find out if number is prime or not.
    public boolean primenum (int p){
    	if (p<=1)
    		return false;
    	    		for (int i =  2; i<p ; i++);
    				if (p % i == 0);
    				return false;
    				return true;
    				}
    
    
        
    
    				
    
    //8.Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
    
       public int marks(int m){
    	   if (m >=91& m<=100)
    		   System.out.println("Grade A");
    		   if(m>=81 & m<90){
    			   System.out.println("Grade is AB");}
    			   if (m>=71 & m<=80){
    				   System.out.println("Grade is BB");}
    				   if (m>=61 & m<=70){
    					   System.out.println("Grade is BC");}
    					   if (m>=51 & m<=60){
    						   System.out.println("Grade is CD");}
    						   if (m>=41 & m<=50){
    							   System.out.println("Grade is DD");}
    							   else 
    								   if (m<=40){System.out.println("Fail");	
    		    	   	
								}
    						   return m;}
    								   
                               
    
    //9.Write a program to print the factorial of a number by defining a method named 'Factorial'.
   // Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n.

	public int fact(int x){
    if(x == 0 || x == 1){
      return 1;
    }
    else{
      return fact(x-1)*x;}
 }

	}
 












