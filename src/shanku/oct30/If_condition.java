package shanku.oct30;

public class If_condition {
	public static void main(String[] args) {
		String str="i love my india ";
		String str1="I love my india";
		String str2="I LOVE MY INDIA";
		String str3="i love my india";

				/*System.out.println(str.equals(str1));
				System.out.println(str1.equals(str2));
				System.out.println(str3.equals(str1));
				System.out.println(str.equalsIgnoreCase(str3));
				System.out.println(str1.startsWith("I"));
				System.out.println(str2.endsWith("INDIA"));
				System.out.println(str.charAt(12));
				System.out.println(str.charAt(7));
				System.out.println(str2.indexOf('V'));
				System.out.println(str.indexOf('i')+12);*/

		System.out.println(str.replace("love","hate"));
		System.out.println(str1.replaceAll(str1,"true love never ends"));
		System.out.println(str2.replaceFirst(str2, str3));



	}

	}


