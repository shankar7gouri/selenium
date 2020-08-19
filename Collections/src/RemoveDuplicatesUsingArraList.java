import java.util.ArrayList;

public class RemoveDuplicatesUsingArraList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Shankar");
		al.add("Mahadev");
		al.add("Nagesh");
		al.add("Shankar");
		al.add("Shankar");
		al.add("Ramanna");
		al.add("Nagesh");
		al.add("Anand");
		for(int i=0;i<al.size();i++) {
			for(int j=i;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
					al.remove(j);
				j--;
					
				}
				System.err.println(i);
				
			}
		}
		/*
		 * List<Object> deDupStringList = new ArrayList<>(new LinkedHashSet<>(al));
		 * System.out.println(deDupStringList);
		 */
		/*
		 * Set<Object> s=new LinkedHashSet<Object>(al); System.out.println(s);
		 */
		

	}

}
