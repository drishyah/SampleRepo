package Inheritance;

public class SingleChild extends SingleParent {
	
	public void print()
	{
		System.out.println("This is Child Class");
	}
	
	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.print();
		obj.display();
	}

}
