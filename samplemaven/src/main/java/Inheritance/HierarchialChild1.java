package Inheritance;

public class HierarchialChild1 extends HierarchialParent {
	public void print()
	{
		System.out.println("hierarchial child1");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj=new HierarchialChild1();
		obj.display();
		obj.print();

	}

}
