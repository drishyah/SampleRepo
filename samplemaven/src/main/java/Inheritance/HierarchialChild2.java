package Inheritance;

public class HierarchialChild2 extends HierarchialParent {

	public void print() {
		System.out.println("Hierarchial Child2");
	}
	public static void main(String[] args) {
		HierarchialChild2 obj=new HierarchialChild2();
		obj.print();
		obj.display();

	}

}
