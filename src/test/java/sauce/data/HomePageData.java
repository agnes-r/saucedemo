package sauce.data;

import org.testng.annotations.DataProvider;

public class HomePageData {
	
	@DataProvider(name = "filterDropdown")
	public Object[][] dropdownValues(){
		return new Object[][] {{"az"},{"za"},{"hilo"},{"lohi"}};
	}
}
