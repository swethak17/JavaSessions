package JavaSessions;

import java.util.ArrayList;

public class Assignment {
	//1.
		public static void main(String args[]) {
		//ArrayList<String> colors = new ArrayList <String> ();
		//colors.add("red");
	//	colors.add("Orange");
		//colors.add("yellow");
		//colors.add("blue");
		
		
	
//	for (int i = 0; i<colors.size();i++){
	//	System.out.println(colors.get(i));
	//}
	
	//colors.add("s");
	//colors.add("s");
	//colors.add("s");
	
	//System.out.println("colors :" + colors);
	
	
 //2. Write a Java program to insert an element into the array list at the first and last positions.
	
	ArrayList<Integer> n = new ArrayList<Integer> ();
	n.add(100);
	n.add(200);
	n.add(300);
	n.add(400);
		System.out.println("ArrayList" + n);
		// find First Element and Last Element
	int first = n.get(0);
	int last  = n.get(n.size()-1);
	System.out.println("\nFirst : " + first + ", Last : " + last);
	 
      //3. Write a Java program to retrieve an element (at a specified index) from a given array list.
	
	System.out.println(n.get(2));
		
	//4.Write a Java program to update specific array element by given element.
	
	ArrayList <String> Colors = new ArrayList <String> ();
	Colors.add("Orange");
	Colors.add("Red");
	Colors.add("Yellow");
	Colors.add("Black");
	Colors.add("Green");
	//for (int i = 0; i<Colors.size(); i++){
	//System.out.println(Colors.get(i));

	System.out.println("ArrayList before replace: " + Colors);
	
	//RED - Brown
	Colors.set(2 ,"Brown");
	System.out.println("ArrayList after replace: " + Colors);;
			}			
	//5. Write a Java program to remove the third element from a array list.
		
		ArrayList<String> nameslist = new ArrayList  <String> ();
		
		
		
		
				
		
		
		
		
}




