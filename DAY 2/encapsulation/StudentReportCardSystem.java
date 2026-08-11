package encapsulation;

public class StudentReportCardSystem {

	public static void main(String[] args) {
		ReportCard s1 = new ReportCard(1032,"Dhani",91,92,93,97,89);
//		s1.setRollNo(1032);
//		s1.setName("Dhani");
//		s1.setM1(91);
//		s1.setM2(92);
//		s1.setM3(93);
//		s1.setM4(97);
//		s1.setM5(89);
		s1.calResult();
//		s1.grade="B";// gives error as it is private
		s1.getStudentDetails();
		
		

	}

}
