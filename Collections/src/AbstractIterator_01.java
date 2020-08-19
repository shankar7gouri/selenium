import java.util.AbstractList;
import java.util.LinkedList;
import java.util.ListIterator;

public class AbstractIterator_01 {

	public static void main(String[] args) {
	AbstractList<String> ab=new LinkedList<String>();
	ab.add("Shankar");
	ab.add("Mahadev");
	ab.add("Qauder");
	ab.add("Mahendra bahubali");
	ab.add("Mangal");
	ab.add("Manager");
	System.out.println(ab);
	System.out.println("to Set the elements in Abstract List "+ab.set(2, "Mango"));
	System.out.println(ab);
	System.out.println("replacing the value"+ab.set(4, "Anand"));
	System.out.println(ab);
	//Creating List Iterator
	
		/*
		 * ListIterator<String> li=ab.listIterator(3);
		 * System.out.println("The List is  as fallowes "); while(li.hasNext()) {
		 * System.out.println(li.next()); }
		 */

	}

}
