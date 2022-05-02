package testingUsingJUnit5.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import testingUsingJUnit5.EmailValidator;
import testingUsingJUnit5.PasswordValidator;

@RunWith(JUnitPlatform.class)
@SelectClasses({ EmailValidator.class, PasswordValidator.class })
public class EmailAndPassValidatorTestSuite {

}
