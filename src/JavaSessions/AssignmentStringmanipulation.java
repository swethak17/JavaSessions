package JavaSessions;

public class AssignmentStringmanipulation {

	public static void main(String[] args) {
	
		String i = new String ("Italic");
		String s = new String ("italic");
		if (i.equals(s)){
			System.out.println("Both i and s are Equal" );
		}
		else {
			System.out.println("Not Equal");
		}
		
		String style = new String ("Bold");
		String style1 = new String ("Bold");
		if (style.equals(style1)){
			System.out.println("Equal");
		}else
		{
			System.out.println("Not Equal");
		}
		
		//2.Remove all  spaces in a String . 
		 	 String H = ( "       Hello      Everyone      ");
		 	 System.out.println(H.trim().replace(" ", ""));
		
	 //3.Write a program that will  print out last character and first character of a word.
	     	 
		 	 String m = ("HELLOEVERYONE");	 
		 	 char first = m.charAt(0);
		 	 char last = m.charAt(m.length()-1);

		 	 System.out.println("First Character is  " +  first);
		 	 System.out.println("Last Character is  " +  last);
		 	 
		//4.Write a program to verify a word or a character contains in the sentence.	 
		 	 
		 	 String a = ("I am new to automation testing");
		 	 if (a.contains("automation")){
		 		 System.out.println("The keyword :automation:  is found in the sentence  ");
		 		 	 } else
		 		 	 { System.out.println("The Keyword: automation:  is NOT found in the sentence");
		 		 	 }
	//5.Write a function/ method to reverse your own name.
		 	 
		 	 String k = ("SWETHA");
		 	byte [] strAsByteArray = k.getBytes(); 
		    byte [] result =  new byte [strAsByteArray.length]; 
		 	
		    for (int r = 0; r<strAsByteArray.length; r++) 
	            result[r] =  
	             strAsByteArray[strAsByteArray.length-r-1]; 
	  
	        System.out.println(new String(result)); 
	
	//6.Write a program that gives you last half of the string.
	        
	        String ip = "HelloHola";    
	        String lastFourChars = "";     
	         
	        if (ip.length() > 4)
	        {
	            lastFourChars = ip.substring(ip.length() - 4);
	        }
	        else
	        {
	            lastFourChars = ip;
	        }
	         System.out.println(lastFourChars);
	         
	 //8.Write a program which gives index of (-1) of a String.
	     
	         String str = ("I am so happy");
	         System.out.println(str.length());
	         System.out.println(str.indexOf("Hi"));
	         
	 //9.Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop)
	         
	         String d = "kriya;25;f;5000;usa;true";
	     	String dval[] = d.split(";");
	     	
	     	for (int l =0; l<dval.length;l++){
	     	System.out.println(dval[l]);}
	         
	  //10. Assume that a string consists of 3 words, print out the middle one. 
	     	
	     	String tr = ("My Java Code");
	        String mid  = tr.substring(3, 8);
	        		System.out.println("The middle word:  "+ mid);
	        
	   //7.Write a program to get the 3rd  “ e “ of the string .
	        		
	        		String st = ("Welcome to Naveen Automation Lab !");
	        		 System.out.println(st.length());
	        		 System.out.println(st.indexOf("e",15 ));
   	    
	
	}
	        		        
	        		        
	        		    } 
	



