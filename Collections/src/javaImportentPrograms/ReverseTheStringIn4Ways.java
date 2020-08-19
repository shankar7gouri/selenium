package javaImportentPrograms;

public class ReverseTheStringIn4Ways {

	public static void main(String[] args) {
		String str1="FuckOff";
		String rev="";
		int len=str1.length()-1;
		
		/*
		 * //i)Using ForLoop for(int i=len;i>=0;i--) { rev=rev+str1.charAt(i);
		 * 
		 * } System.out.println("Reversed String \t::"+rev);
		 */
		
		//ii)
		/*
		 * for(int i=len;i>=0;i--) { System.out.print(str1.charAt(i)); }
		 */
		/*
		 * //iii)Using CharArray char a[]=str1.toCharArray(); int len1=a.length-1;
		 * for(int i=len1;i>=0;i--) { //rev=rev+a[i]; System.out.print(a[i]); }
		 * //System.out.println("Reversed string is \t::"+rev);
		 */
		
		//iv) using StringBuffer class
		StringBuffer sBuffer=new StringBuffer(str1);
		sBuffer.reverse();
		System.out.println(" Reversed String is \t::" +sBuffer);
		
		
	}

}
