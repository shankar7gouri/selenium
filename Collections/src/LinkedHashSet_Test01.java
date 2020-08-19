import java.util.LinkedHashSet;

public class LinkedHashSet_Test01 {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
		lhs.add(10);
		lhs.add(30);
		lhs.add(10);
		lhs.add(20);
		System.out.println(lhs);
		

	}

}
