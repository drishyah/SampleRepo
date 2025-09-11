package Inheritance;

public class MultilevelChild extends MultilevelParent{
	public void multilevel()
	{
		System.out.println("Multilevel Child");
	}
	public static void main(String[] args) {
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.print();
		obj.multilevel();

	}

}
