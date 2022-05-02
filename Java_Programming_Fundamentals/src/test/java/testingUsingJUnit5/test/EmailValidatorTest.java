package testingUsingJUnit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testingUsingJUnit5.EmailValidator;
import testingUsingJUnit5.exception.GoldenTrioException;

public class EmailValidatorTest {
	@Test
	public void validateEmailIdValidEmailId() throws GoldenTrioException {
		String emailId = "James_Potter@xyz.com";
		EmailValidator emailValidator = new EmailValidator();
		boolean result = emailValidator.validateEmailId(emailId);
		Assertions.assertTrue(result);
	}

	@Test
	public void validateEmailIdInvalidEmailId() throws GoldenTrioException {
		String emailId = "James_Potter@xyz.org";
		EmailValidator emailValidator = new EmailValidator();
		boolean result = emailValidator.validateEmailId(emailId);
		Assertions.assertFalse(result);
	}
	
	@Test 
	public void validateEmailIdInvalidEmailIdException() throws GoldenTrioException{
		String emailId = null;
		EmailValidator emailValidator = new EmailValidator();
		GoldenTrioException exception = assertThrows(GoldenTrioException.class, ()-> emailValidator.validateEmailId(emailId));
		assertEquals("Invalid Email Id", exception.getMessage());
		
	}
}
