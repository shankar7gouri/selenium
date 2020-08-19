package javaImportentPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.err.println(org_num+" ------>It is a  Palindrome Number");
			
		}else {
			System.out.println(org_num+" ------->It's not a Palindrome Number");
		}

	}

}
