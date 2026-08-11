package inheritance_example;

public class NetBankingService extends PaymentService{
	void payWithNetBanking(long custId, long mobile) {
		super.sendOTP(mobile);
		System.out.println("Purchased with NetBanking "+custId);
	}
}
