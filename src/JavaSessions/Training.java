package JavaSessions;

public class Training {

	String name;
	String course;
	String time;
	
	public Training(){
		
	}

	public Training(String name, String course, String time) {
		super();
		this.name = name;
		this.course = course;
		this.time = time;
	}
	
	
	@Override
	public String toString() {
		return "Training [name=" + name + ", course=" + course + ", time="
				+ time + "]";
	}

	public static void main (String ar[]){
		Training tr = new Training("Naveen", "java" , "7am IST");
		System.out.println(tr.toString());
	}
	
}
