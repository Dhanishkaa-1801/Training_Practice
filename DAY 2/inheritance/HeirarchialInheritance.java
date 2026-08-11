package inheritance;
class Head
{
    String headOffice = "ABC str, SREC nagar, Delhi";

    void display() {
        System.out.println("hello");
    }
}

class ChennaiOfc extends Head
{
    void chennaiOfcReport() {
        System.out.println("Head Office Location :"+ super.headOffice);
        System.out.println("Today Chennai Report");
    }
}

class CoimbatoreOfc extends Head
{
    void cbeOfcReport() {
        System.out.println("Head Office Location :"+ super.headOffice);
        System.out.println("Today Coimbatore Report");
    }
}

public class HeirarchialInheritance {
	public static void main(String[] args) {
		
		ChennaiOfc b1 = new ChennaiOfc();
		b1.chennaiOfcReport();
		
		CoimbatoreOfc b2= new CoimbatoreOfc();
		b2.cbeOfcReport();
	}
}
