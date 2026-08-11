package inheritance_example;

public class UPIPaymentService extends PaymentService {

    void payWithUPI(long mobile, String upiId) {

        super.sendOTP(mobile);

        System.out.println("Purchased with UPI " + upiId);
    }

}