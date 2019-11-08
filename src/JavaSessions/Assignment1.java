package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		//5. Write a Java program to remove the third element from a array list.
		
				ArrayList<String> nameslist = new ArrayList  <String> ();
				nameslist.add("Aamir");
				nameslist.add("Rachel");
				nameslist.add("Rob");
				nameslist.add("Salman");
				nameslist.add("Shahrukh");
				
				System.out.println(nameslist.size());
				System.out.println(nameslist); 
				nameslist.remove(3);
				
				System.out.println(nameslist.size());
				System.out.println(nameslist); 
				
		//6.Write a Java program to search an element in a array list.
            if (nameslist.contains("Rob")){
            	System.out.println("Found the Element");}
            	else System.out.println("Element not found");
            
	System.out.println("List before reversing :\n" + nameslist);
	
	//7.Write a Java program to reverse elements in a array list
                 Collections.reverse(nameslist);
                  
	System.out.println("List after reversing :\n" + nameslist);
	
	
	//8. Write a Java program to extract a portion of a array list.
	
	ArrayList <String> Colors = new ArrayList <String> ();
	Colors.add("Orange");
	Colors.add("Red");
	Colors.add("Yellow");
	Colors.add("Black");
	Colors.add("Green");
	
	System.out.println("Original list:" + Colors);
	List<String> sub_list = Colors.subList(0,3);
	
	System.out.println("List of firt 3 Elements:" + sub_list);
	
	//9. Write a Java program of swap two elements in an array list.
	
	String temp = Colors.get(0);
	Colors.set(0, Colors.get(1));
	Colors.set(1, temp);
	System.out.println("Two Elements Swapped  " + Colors.get(0)+ " " + Colors.get(1));
	System.out.println("swapped list:" + Colors);
	
	//10. Write a Java program to empty an array list.
    //Colors = null; 
	System.out.println("swapped list:" + Colors);
	
	
	//11.Write a Java program to trim the virtual capacity of an array list the current list size. 
	Colors.trimToSize();
	System.out.println("Virtual Capacity is "+Colors.size());
	
		//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	System.out.println(" The List of Colors are " );
	for (int i = 0; i<Colors.size();i++){
		System.out.println(Colors.get(i));}
	
	//
	
	for (int i = 0; i<Colors.size(); i=i+2){
		System.out.println("Altenative Colors are :"  + Colors.get(i));
	}
	
	
	
	
	
	
	
	
	
	
	}

}
