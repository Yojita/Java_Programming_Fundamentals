package testingUsingJUnit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testingUsingJUnit5.VoterValidator;

public class VoterValidatorTest {

	private static int counter;

	@BeforeAll
	public static void beforeMethod() {
		System.out.println("Before test cases");
	}

	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before test case : " + (++counter));
	}

	@AfterAll
	public static void afterMethod() {
		System.out.println("After test cases : " + counter);
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println("After test cases");
	}

	@Test
	public void validateVoterAgeValidTest() throws Exception {
		int age = 18;
		VoterValidator voterValidator1 = new VoterValidator();
		boolean result1 = voterValidator1.validateVoterAge(age);
		Assertions.assertTrue(result1);
	}

	@Test
	public void validateVoterAgeInvalidTest() throws Exception {
		int age = 17;
		VoterValidator votervalidator2 = new VoterValidator();
		boolean result2 = votervalidator2.validateVoterAge(age);
		assertFalse(result2);
	}

	@Test
	public void validateVoterAgeExceptionTest() throws Exception {
		int age = -17;
		VoterValidator voterValidator3 = new VoterValidator();
		Exception exception = assertThrows(Exception.class, () -> voterValidator3.validateVoterAge(age));
		assertEquals("Invalid age", exception.getMessage());
	}

	@ParameterizedTest
	@CsvSource(value = { "19, true", "20, true", "17, false", "16, false" })
	public void validateVoterAgeTestParameter(int age, boolean expected) throws Exception {
		VoterValidator voterValidator4 = new VoterValidator();
		boolean actual = voterValidator4.validateVoterAge(age);
		assertEquals(expected, actual);
	}
}
