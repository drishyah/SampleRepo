package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref) {
		this.city=city;
		this.state=state;
		this.ref=ref;
	}
	
	public void print() {
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println("city: "+city+" State: "+state);
		
	}

	public static void main(String[] args) {
		Aggregation1 obj1=new Aggregation1("Deepak",10);
		Aggregation2 obj=new Aggregation2("Ottapalam","Kerala",obj1);
		obj.print();

	}

}
