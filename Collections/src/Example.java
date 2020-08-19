
public class Example {
	private int  x;
	private int y;
	public Example(int x,int y) {
		this.x=x;
		this .y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
		}
	public int getY() {
		return y;
		}
	public void setY(int y) {
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println(this+"  "+obj);
		if(obj instanceof Example) {
			Example e=(Example)obj;
			return this.y==e.y;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Ex(" +x+ "," +y+ ")";
	}
	

}
