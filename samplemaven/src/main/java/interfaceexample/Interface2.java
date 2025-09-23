package interfaceexample;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();

	}

	@Override
	public void display() {
		System.out.println("hello");
	}

	@Override
	public void print() {
		System.out.println("interface");
	}

}
