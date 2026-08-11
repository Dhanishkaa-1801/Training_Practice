

class Employee{
	int empId;
	String name;
	String gender;
	
	Employee(){
		System.out.println("At the Constructor");
	}
	
	Employee(int empId, String name, String gender){
		this.empId = empId;
		this.name= name;
		this.gender=gender;
		
	}
	
	void getEmployeeDetails() {
		System.out.println(this.empId + " " + this.name + " " + this.gender);
		
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1032,"Dhani","Female");
//		System.out.println(e1.empId + " " + e1.name + " " + e1.gender);
		e1.getEmployeeDetails();
		
		Employee e2 = new Employee();
		e2.getEmployeeDetails();
		
	}

}
