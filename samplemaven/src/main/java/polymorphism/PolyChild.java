package polymorphism;

public class PolyChild extends PolyParent{
	
	public void display(int a,int b) {
		super.display(10,5);
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void main(String[] args) {
		PolyChild obj=new PolyChild();
		obj.display(10,5);
	}
}
