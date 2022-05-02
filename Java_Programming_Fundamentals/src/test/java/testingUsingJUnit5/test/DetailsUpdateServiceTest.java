package testingUsingJUnit5.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import testingUsingJUnit5.testingintances.DetailsUpdateDAO;
import testingUsingJUnit5.testingintances.DetailsUpdateService;

@RunWith(MockitoJUnitRunner.class)
class DetailsUpdateServiceTest {

	DetailsUpdateService service;

	DetailsUpdateDAO dao;

	@BeforeEach
	public void setup() {
		service = new DetailsUpdateService();
		dao = Mockito.mock(DetailsUpdateDAO.class);
		service.setDao(dao);
	}

	@AfterEach
	public void cleanup() {
		service = null;
	}

	@Test
	void testUpdateRecordsIfDataNull() {
		assertThrows(IllegalArgumentException.class, () -> service.updateRecords(null));
	}

	@Test
	void testUpdateRecordsIfDataNotNull() {
		Mockito.when(dao.updateToDb("")).thenReturn("Ok");
		String result = service.updateRecords("");
		assertEquals("Ok", result);
		Mockito.verify(dao, Mockito.atLeast(1)).updateToDb("");
	}

}
