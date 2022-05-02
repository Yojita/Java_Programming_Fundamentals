package testingUsingJUnit5.testingintances;

public class DetailsUpdateService {

	DetailsUpdateDAO dao;

	public String updateRecords(String data) {
		if (null == data) {
			throw new IllegalArgumentException();
		}
		return dao.updateToDb(data);
	}

	public void setDao(DetailsUpdateDAO dao) {
		this.dao = dao;
	}
}
