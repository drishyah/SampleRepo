package superkeyword;

public class SuperConstructorChild extends SuperConstructor {
	public SuperConstructorChild() {
		super(4,5);
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		

	}

}
