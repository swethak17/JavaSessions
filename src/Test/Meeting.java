package Test;

public class Meeting {

	public int id;
	private String password;
	
	int StudentCount = 100;
	protected boolean isRecorded;
	
	public Meeting(int id , String password){
	 this.id = id;
	 this.password = password;
	}
	
	public void start(){
		System.out.println("Meeting Start");
	}
	
	public void chat(){
		System.out.println("Chat Start");
	}
	
	public static void main(String a[]){
		
		Meeting m = new Meeting(123 , "test123");
		System.out.println(m.id);
		System.out.println(m.password);
		m.start();
		m.chat();
		
		System.out.println(m.StudentCount);
		System.out.println(m.isRecorded);
	}
	
	
	
	
	
}
