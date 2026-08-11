package encapsulation;

public class ReportCard {
	private int rollNo;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int m4;
	private int m5;
	private int total;
	private float avg;
	private String grade;
	static String sclName = "SREC School";
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public int getM4() {
		return m4;
	}
	public void setM4(int m4) {
		this.m4 = m4;
	}
	public int getM5() {
		return m5;
	}
	public void setM5(int m5) {
		this.m5 = m5;
	}
	public int getTotal() {
		return total;
	}
	public float getAvg() {
		return avg;
	}
	public String getGrade() {
		return grade;
	}
	
	public ReportCard(int rollNo, String name, int m1, int m2, int m3, int m4, int m5) {
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
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
