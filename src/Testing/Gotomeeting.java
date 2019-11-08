package Testing;

import Test.Meeting;


public class Gotomeeting extends Meeting {

	public Gotomeeting(int id, String password) {
		super(id, password);
		
	}

	public static void main(String[] args) {
		Meeting m = new Meeting(3433, "test1234");
        
		System.out.println(m.id);
		m.start();
	
	   Gotomeeting go = new Gotomeeting(4555, "test1234");
	   System.out.println(go.isRecorded);
	   
	}
	

}
