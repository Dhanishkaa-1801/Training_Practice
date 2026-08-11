package inheritance_example;

public class BankServiceV3 extends BankServiceV2 {

    void updatePANNumber() {
        System.out.println("PAN No updated...");
    }

    void applyForHomeLoan(long accNo, float loanAmount, int tenure) {
        System.out.println("Your home loan application is processing...");
    }
}