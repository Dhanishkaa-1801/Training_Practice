package inheritance_example;

public class UserAccountServiceImpl implements UserAccountService{

	@Override
	public void createAccount(User newUser) {	
	}

	@Override
	public void deleteAccount(String username) {
	}

	@Override
	public void login(String username, String password) {	
	}

	@Override
	public boolean isActive() {
		return false;
	}

	@Override
	public boolean isDeactivated() {
		return false;
	}
	
}
