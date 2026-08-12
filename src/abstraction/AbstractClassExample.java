package abstraction;

public class AbstractClassExample {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Addition: "+obj.add(10, 20));
		obj.display();
		
//		Arithmetic obj1 = new Arithmetic(); cant call using abstract class's object

	}

}
