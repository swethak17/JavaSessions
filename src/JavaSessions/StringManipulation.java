package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "This is my java code and I am so happy";
		
		System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(1));
      //System.out.println(str.charAt(38));//String index out bound exception
        
        System.out.println(str.indexOf(0));
        System.out.println(str.indexOf("m"));
        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf("Hello"));
	
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("s",4));//1st Occurence of S
        System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurence of S
        
        System.out.println(str.indexOf('h'));
        
	String mesg = "Welcome Admin";
	if (mesg.indexOf("Admin")>0){
		System.out.println("PASS");
	}else {
		System.out.println("Fail");
	}
	String meg = "Welcome null";
	if (meg.indexOf("Admin")>0){
		System.out.println("PASS");
	}else {
		System.out.println("Fail");
	}
	
	//Compare Strings
	
	String s1 = "HelloWorld";
	String s2 = "HelloWorld";
	
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//Trim
	
	String P = "     Hello World     ";
	System.out.println(P.trim());
	
	//replace 
	System.out.println(P.trim().replace(" ",""));
	
	String dob = "01-01-1990";
	System.out.println(dob.replace("-","/"));
	
	//Uppercase and lower case
	
	String h1 = "This is Selenium";
	System.out.println(h1.toLowerCase());
	System.out.println(h1.toUpperCase());
	
	//Sub string
	
	String st = "Transaction id is 1234";
	System.out.println(st.substring(6));
	System.out.println(st.substring(0, 12));
	System.out.println(st.substring(18));
	
	System.out.println(st.substring(st.indexOf("is")+3, st.length()));
	
	//split
	
	String data = "Tom;25;male;1000;usa";
	String dataval[] = data.split(";");
	
	System.out.println(dataval[0]);
	
	for (int i =0; i<dataval.length;i++){
	System.out.println(dataval[i]);
	}
	String test = "xXJavaxXPythonxXRubyxXSeleniumxX";
	String val[] = test.split("xX");
	
	System.out.println(val[1]);
	System.out.println(val[2]);
	System.out.println(val[3]);
	System.out.println(val[4]);
	
	String name = "Tom Peter Steve";
	name.split(" ");
	System.out.println(name.split(" ")[0]);
	System.out.println(name.split(" ")[1]);
	System.out.println(name.split(" ")[2]);
	
	for (int i =0; i<name.split(" ").length; i++){
		System.out.println(name.split(" ")[i]);
	}
	
	String Credentials = "admin; testpassword";
	String username = Credentials.split(";")[0];
	String password = Credentials.split(";")[1];
	
	System.out.println(username + password);
	dologin(username,password);
	
		}
	public static void dologin(String un , String pwd){
		System.out.println("login with app" + un + "  "+ pwd);
	}
	
	

}
