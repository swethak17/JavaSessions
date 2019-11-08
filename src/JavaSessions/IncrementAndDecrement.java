package JavaSessions;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		int i = 1;
		int j = i++; // post increment
		System.out.println(i);//2
		System.out.println(j);//1
		
		int p = 99;
		int q = p++;
		System.out.println(p);//100
		System.out.println(q);//99
		
		int m = 1;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
		
		int h = 2;
		int g = h--;//post decrement
		System.out.println(h);
		System.out.println(g);
		
		int s =0;
		int z = --s;
		System.out.println(s);
		System.out.println(z);
	
				
	}

}
