package polymorphism;

class SwiggyV1{
	void sendOTP() {
		System.out.println("Type your email: ");
		System.out.println("OTP sent to mail, Please enter it: ");
	}
	
	void placeOrder() {
		System.out.println("Your order placed");
	}
}

class SwiggyV2 extends SwiggyV1{
	
	@Override
	void sendOTP(){
		super.sendOTP(); // give if else condition for a choice to fix smthg
		System.out.println("Type your mobile number: ");
		System.out.println("OTP sent to mobile, Please enter it: ");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		SwiggyV2 obj = new SwiggyV2();
		obj.sendOTP();
		obj.placeOrder(); //if no changes for this, no need to update in V2 so it still can be called as the same
		
	}

}
