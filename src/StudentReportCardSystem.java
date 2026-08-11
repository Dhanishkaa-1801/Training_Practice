class StudentReportCard{
	int rollNo;
	String name;
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	int total;
	float avg;
	String grade;
	
	StudentReportCard(int rollNo,String name, int m1,int m2, int m3, int m4, int m5){
		this.rollNo = rollNo;
		this.name = name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
	}
	
	void calResult() {
		this.total = m1+m2+m3+m4+m5;
		this.avg = total/5;
		if(avg>=90) {
			this.grade="A";
		} else if(avg>80 && avg<90){
			this.grade="B";
		}else if(avg>70 && avg<80){
			this.grade="B";
		} else if(avg>60 && avg<70){
			this.grade="B";
		}else if(avg>50 && avg<60){
			this.grade="B";
		}else {
			this.grade="Fail";
		}
	}
	
	
	
	void getStudentDetails(){
		System.out.println(this.rollNo + " "+ this.name +" " + this.total + " " +this.avg + " " + this.grade);
	}
	
}

public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1 = new StudentReportCard(1032,"Dhani",91,92,93,89,97);
		s1.calResult();
//		s1.grade="B"; // no safety
		s1.getStudentDetails();
		
		StudentReportCard s2 = new StudentReportCard(1022,"Christy",92,95,91,94,96);
		s2.calResult();
		s2.getStudentDetails();

	}

}
