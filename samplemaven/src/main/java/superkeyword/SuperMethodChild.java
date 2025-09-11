package superkeyword;
//calling parent class method using super keyword
public class SuperMethodChild extends SuperMethod {
	public void print() {
		System.out.println("SuperMethodChild");
		super.display();
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();

	}

}
