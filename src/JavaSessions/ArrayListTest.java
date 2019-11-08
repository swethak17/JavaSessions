package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		ar.add(400);//3
		ar.add(500);//4
		ar.add(600);//5
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar.get(5));
		
		ar.remove(4);
		System.out.println(ar.size());
		//System.out.println(ar.get(5));IndexOutofBoundsException
		System.out.println(ar.get(4));
		
		ArrayList<String> names = new ArrayList<String> ();
		names.add("Rakesh");
		names.add("Harshad");
		names.add("Anusha");
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		//for (int i = 0; i<= names.size();i++){
			//System.out.println(names);
					//}
		ArrayList<Integer> EmpAge = new ArrayList<Integer> ();
		EmpAge.add(20);
		EmpAge.add(25);
		EmpAge.add(28);
		
		System.out.println(names.get(0)+" " +EmpAge.get(0));
		
		for (int i = 0 ; i<names.size();i++){
			
			//System.out.println(names.get(i)+" "+EmpAge.get(i));
			System.out.println(EmpAge.get(i));
			System.out.println(names.get(i));
			
			for (String n : names){
				System.out.println(n);
			}
			for (Integer E : EmpAge){
				System.out.println(E);
			}
		//	names.forEach(()-->System.out.println());
		//	EmpAge.forEach((a)-->System.out.println(a));
		}
		//ArrayList<Double> heightlist = new ArrayList<Double>();
		//heightlist.add(12.33);
		//heightlist.add(100.00);
		
		//heightlist.forEach((p)-->System.out.println(p));
		
	
	}
}
