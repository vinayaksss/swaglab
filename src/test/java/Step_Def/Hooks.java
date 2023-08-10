package Step_Def;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base_Test {

	@Before
	public void setUpBrowser() {

		get_driver();

	}

	@After
	public void tearDown() {
		closeBrowser();
	}
	
	public void tearDownn() {
		closeBrowser();
	}
	
	public void tearDowvnn() {
		closeBrowser();
	}

}
