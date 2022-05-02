package testingUsingJUnit5;

import testingUsingJUnit5.exception.GoldenTrioException;

public class EmailValidator {
	public boolean validateEmailId(String emailId) throws GoldenTrioException {
		if (emailId == null || emailId.isBlank())
			throw new GoldenTrioException("Invalid Email Id");

		return emailId.matches("\\w+@\\w+\\.(com|in)");
	}
}
