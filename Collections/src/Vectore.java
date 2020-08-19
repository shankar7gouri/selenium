import java.util.Vector;

public class Vectore {

	public static void main(String[] args) {
		Vector<Object> v =new Vector<Object>();
		v.add(10);
		v.add(30);
		v.add(10);
		v.add(20);
		System.out.println(v);
		System.out.println(v.get(3));

	}

}
