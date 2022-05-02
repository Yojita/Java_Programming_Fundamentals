package testingUsingJUnit5;

import testingUsingJUnit5.exception.GoldenTrioException;

public class PasswordValidator {
	public boolean validatePassword(String password) throws GoldenTrioException {
		if (password == null || password.isBlank())
			throw new GoldenTrioException("Invalid Password");
		return password.matches("[A-Za-z0-9]{8,20}");
	}
}
