

class Student{
	int rollno;
	String name;
	int age;
	String gender;	
	
	void setValues(int rollno, String name, int age, String gender) {
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}


public class SchoolSystem {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.rollno=2401032;
//		s1.name="Dhanishkaa";
//		s1.age=19;
//		s1.gender="Female";
		
		s1.setValues(2401032, "Dhanishkaa", 19, "female");
		
		System.out.println("Roll no: " + s1.rollno);
		System.out.println("Name : " + s1.name);
		System.out.println("Age: " + s1.age);
		System.out.println("Gender: " + s1.gender);
		
		System.out.println("Full details: "+ s1.rollno + " " + s1.name + " " + s1.age + " " + s1.gender);
	}

}
