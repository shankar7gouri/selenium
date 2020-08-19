import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
		//Creating empty Linkedlist
		Queue<Integer> q=new LinkedList<Integer>();
		
		//Adding values using add() method
		q.add(10);
		q.add(20);
		q.add(30);
		
		// to print the top values using peek method
		System.out.println(q.peek());
		//System.out.println(q.poll());
		System.out.println(q.peek());

	}

}
