
public class Maha {
	

		  static void splitString(String str) 
		    { 
		        StringBuffer alpha = new StringBuffer();  
		        StringBuffer num = new StringBuffer();
		       StringBuffer special = new StringBuffer(); 
		          
		        for (int i=0; i<str.length(); i++) 
		        { 
		            if (Character.isDigit(str.charAt(i))) 
		                num.append(str.charAt(i)); 
		            else if(Character.isAlphabetic(str.charAt(i))) 
		                alpha.append(str.charAt(i)); 
		            else
		                special.append(str.charAt(i)); 
		        } 
		       
		        System.out.println(alpha); 
		        System.out.println(num); 
		        System.out.println(special); 
		    } 
		      
		    public static void main(String args[]) 
		    { 
	String str = "I'll make more ##100@@$%$%!! Nice"; 
		        splitString(str); 
		        System.out.println(str.length());
		    } 
		} 



