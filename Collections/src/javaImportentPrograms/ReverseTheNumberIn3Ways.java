package javaImportentPrograms;

import java.util.Scanner;

public abstract class ReverseTheNumberIn3Ways {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		/*//(i)Using while condition
		 * int rev=0; while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 * System.out.println("Reverse the number value \t::"+rev);
		 */
		//(ii) Using StringBuffer Class
		/*
		 * StringBuffer sBuffer=new StringBuffer(String.valueOf(num)); StringBuffer
		 * rev=sBuffer.reverse(); System.out.println("Reversed Number \t::"+rev);
		 */
//(iii) Using String StringBuilder Class
		StringBuilder sblBuilder=new StringBuilder();
		sblBuilder.append(num);
		StringBuilder revBuilder=sblBuilder.reverse();
		System.out.println("Reversed Number \t::"+revBuilder);
	}

}
