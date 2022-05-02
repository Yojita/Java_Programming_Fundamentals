package testingUsingJUnit5.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import testingUsingJUnit5.BoothValidator;

public class BoothValidatorTest {
	@Tag("prod")
	@Test
	public void validateBoothDetailsValidTest() throws Exception {
		String boothName1 = "Booth1";
		BoothValidator boothvalidator1 = new BoothValidator();
		assertTrue(boothvalidator1.validateBoothDetails(boothName1));
	}

	@Tag("dev")
	@Test
	public void validateBoothDetailsInvalidTest() throws Exception {
		String boothName2 = "";
		BoothValidator boothValidator2 = new BoothValidator();
		assertFalse(boothValidator2.validateBoothDetails(boothName2));
	}

	@Tag("dev")
	@Test
	public void validateBoothDetailsExceptionTest() throws Exception {
		String boothName3 = null;
		BoothValidator validator3 = new BoothValidator();
		Exception exception = assertThrows(Exception.class, () -> validator3.validateBoothDetails(boothName3));
		assertEquals("Booth name is invalid", exception.getMessage());

	}
}
