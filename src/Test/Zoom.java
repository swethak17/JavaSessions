package Test;

public class Zoom {

	public static void main(String[] args) {
		Meeting m = new Meeting(450, "test1234");
		
		System.out.println(m.id);
		//System.out.println(m.password);//cannot access pwd as it is private also can be accessed only within the same class

		System.out.println(m.StudentCount);
		System.out.println(m.isRecorded);
	}

}
