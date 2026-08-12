package abstraction;

class Calculator extends Arithmetic{

	@Override
	int add(int a, int b) {
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		return a-b;
	}
	
	//can use super keyword to call the display() of the Abstract class here
	
}