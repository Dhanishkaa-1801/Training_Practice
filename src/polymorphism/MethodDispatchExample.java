package polymorphism;
//Dynamic Method Dispatch

class V1{
	void sendMessage() {
		System.out.println("Message send to 10 members");
	}
}

class V2 extends V1{
	@Override
	void sendMessage() {
		System.out.println("Message send to 20 members");
	}
	
	void display() {
		System.out.println("Hello from V2");
	}
}

public class MethodDispatchExample {

	public static void main(String[] args) {
//		V2 obj = new V2(); //General approach
//		obj.sendMessage();

		V1 obj = new V2(); //upcasting
		obj.sendMessage();
//		obj.display(); can't call directly with this method
	}

}
