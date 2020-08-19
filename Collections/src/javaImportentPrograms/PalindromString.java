package javaImportentPrograms;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		int len=str.length();
		String org_name=str;
		String revString="";
		for(int i=len-1;i>=0;i--) {
			revString=revString+str.charAt(i);
		}
		//System.out.println(revString);
		
		if(org_name.equals(revString)) {
			System.out.println("it is a palindrome String \t::"+org_name);
		}else {
		System.out.println("It is not Palindrom String \t::"+org_name);
		}
	}

}
