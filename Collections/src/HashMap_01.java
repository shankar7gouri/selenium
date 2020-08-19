import java.util.HashMap;

public class HashMap_01 {

	public static void main(String[] args) {
		HashMap<Object,Object> hm=new HashMap<Object,Object>();
		hm.put("a", 3);
		hm.put("b",4);
		hm.put("d",6 );
		hm.put(5,"c");
		System.out.println(hm.get("a"));
		System.out.println(hm.get(20));
		System.out.println(hm);
	

	}

}
