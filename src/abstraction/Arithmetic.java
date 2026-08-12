package abstraction;

abstract class Arithmetic{
	abstract int add(int a, int b);
	
	abstract int sub(int a, int b);
	
	void display() {  // can put as static if we need to call this
		System.out.println("Hello this is a non abstract");
	}
}
