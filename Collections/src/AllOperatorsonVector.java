import java.util.Vector;

public class AllOperatorsonVector {

	public static void main(String[] args) {
		// Constructors
		Vector<Object> v1=new Vector<Object>();//Emty Vector, 10 Locations, Increment double(*2)
		Vector<Object> v2=new Vector<>(5);//Empty vector, 5 Locations ,Incremental double (*2) 
		Vector<Object> v3=new Vector<>(5,3);//Empty vector,5 Loatios Array ,incremental 3 locations
		Vector<Object> v4=new Vector<>(v2);//with v2 eliment,v2 size() locations , double
		System.out.println(v1.capacity());
		System.out.println(v2.capacity());
		System.out.println(v3.capacity());
		System.out.println(v4.capacity());
		System.out.println();
		
		Vector<Object> v5=new Vector<>(3);
		System.out.println("Capacity : "+v5.capacity());
		System.out.println("size            : "+ v5.size());
		System.out.println("elements  :"+v5);
		System.out.println();
		
		v5.addElement("a");
		v5.addElement("b");
		v5.addElement(5);
		v5.addElement(6.6);
		v5.addElement('p');
		v5.addElement(true);
		System.out.println();
		
		System.out.println(v5.capacity());
		System.out.println(v5.size());
		System.out.println(v5);
		System.out.println();
		
		v5.addElement(new Example(5, 6));
		System.out.println(v5.capacity());
		System.out.println(v5.size());
		System.out.println(v5);
		System.out.println();
		
		Vector<Object> v6=new Vector<>(v5);
		System.out.println("Capacity of v6 : "+v6.capacity());
		System.out.println("the size of v6     : "+v6.size());
		System.out.println("Values in v6       : "+v6);
		System.out.println();
		
		v6.addElement("S");
		v6.addElement("S");
		v6.addElement(null);
		v6.addElement(null);
		System.out.println("Capacity of v6 : "+v6.capacity() );
		System.out.println("Size of v6            : "+v6.size());
		System.out.println("Elements             : "+v6);
		System.out.println();
		
		// Adding Object
		Vector< Object> v7=new Vector<>();
		v7.addElement("a");
		v7.addElement("b");
		v7.addElement(5);
		v7.addElement(6.7);
		v7.addElement('P');
		v7.addElement(true);
		v7.addElement("a");
		v7.addElement(5);
		v7.addElement(6.5);
		v7.addElement(true);
		v7.addElement(11);
		v7.addElement(null);
		v7.addElement(null);
		v7.addElement(new Example(50, 70));
		
//2) Counting the elements\ Obects
		System.out.println("Capacity of  the v7 : "+v7.capacity() );
		System.out.println("Size of the v7 variable : "+v7.size());
//3) Printing Eliments/Objects
		System.out.println("No of Elememnts in the v7  variable	"+v7);
		System.out.println();
//4)Retrieving the elements in the variable randomly
		System.out.println("Get the elements which of u want :"+v7.get(3));
		System.out.println();
		//Retrieving the elements Sequentially
		for(int i=0;i<=v7.size();i++) {
			System.out.println(v7.get(i));
		}
		System.out.println();
//5) Searching 
		System.out.println(" Searching  \"a\" : "+v7.contains("a"));
		
		
		

	}
	

}
