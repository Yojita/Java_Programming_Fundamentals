package testingUsingJUnit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testingUsingJUnit5.PasswordValidator;
import testingUsingJUnit5.exception.GoldenTrioException;

public class PasswordValidatorTest {
	@Test 
	public void validatePasswordValidPassword() throws GoldenTrioException{
		String password = "Asdf1234";
		PasswordValidator passValidator = new PasswordValidator();
		boolean result = passValidator.validatePassword(password);
		Assertions.assertTrue(result);
	}
	
	@Test
	public void validatePasswordInvalidPassword() throws GoldenTrioException{
		String password = "Asdf";
		PasswordValidator passValidator = new PasswordValidator();
		boolean result = passValidator.validatePassword(password);
		Assertions.assertFalse(result);
	}
	
	@Test
	public void validatePasswordInvalidPasswordException() throws GoldenTrioException{
		String password = null;
		PasswordValidator passValidator = new PasswordValidator();
		GoldenTrioException exception = assertThrows(GoldenTrioException.class, ()-> passValidator.validatePassword(password));
		assertEquals("Invalid Password", exception.getMessage());
	}
}
