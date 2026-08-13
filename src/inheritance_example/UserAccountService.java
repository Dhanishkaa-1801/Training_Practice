package inheritance_example;

public interface UserAccountService {
	void createAccount(User newUser);
	void deleteAccount(String username);
	void login(String username, String password);
	boolean isActive();
	boolean isDeactivated();
}
