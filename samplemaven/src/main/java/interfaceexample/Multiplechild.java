package interfaceexample;

public class Multiplechild implements MultipleparentA,MultipleparentB{
	
	public void show() {
		System.out.println("child class");
	}

	public static void main(String[] args) {
		Multiplechild obj=new Multiplechild();
		obj.show();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("ParentB");
	}

	@Override
	public void display() {
		System.out.println("ParentA");
		
	}

}
