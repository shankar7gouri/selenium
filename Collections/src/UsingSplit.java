
public class UsingSplit {


			public static void main(String[] args){
				
				String s="Let's meet l8r 2nits?";
				String[] str=s.split(" [8, 2,?]");
				System.out.println("No of substring :"+str.length);
				for (int i=0;i<str.length;i++) {
					System.out.println("str["+i+"]: "+str[i]);
				}
			
			}
		

}
