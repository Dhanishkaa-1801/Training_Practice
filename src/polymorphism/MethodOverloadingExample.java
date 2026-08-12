package polymorphism;

class Arithmetic{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	//OR
	
	void signup(String username, String pass, String name, String address) {
		//new account with all details
	}
	
	void signup(String googleToken) {
		//signup using googke token navigation 
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {

			Arithmetic obj=new Arithmetic();
			System.out.println(obj.add(10,20));
			System.out.println(obj.add(10,20,30));

	}

}
