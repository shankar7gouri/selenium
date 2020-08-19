
public class Pyramid {
	
	public static void main(String[] args)
	{
		
		int s=10;
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
System.out.print(" *");
			}
			System.out.println();
			
		}
		
		System.out.println();
		int m=20;

for(int i=1;i<=m;i++) {
	for(int j=10;j>=i;j--) {
		System.out.print(" *");
	}
	System.out.println();
}

System.out.println();
int n=10;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j+" "+j);
	}
	System.out.println();
}

System.out.println();
int k=10;
for(int i=1;i<=k;i++) {
	for(int j=10;j>=i;j--) {
		System.out.print(i+" "+j);
	}
	System.out.println();
	
}

System.out.println();
	}
	
	


}
