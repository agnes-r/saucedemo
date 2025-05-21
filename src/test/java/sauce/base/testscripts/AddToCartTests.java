package sauce.base.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import sauce.base.BaseClass;
import sauce.base.pom.CartPageElements;
import sauce.base.pom.HomePageElements;

public class AddToCartTests extends BaseClass {
	
	@Test
	public void checkBadge() {
		HomePageElements hpe = new HomePageElements(driver);
		hpe.getAddToCartButton().get(1).click();
		
		String badge = new CartPageElements(driver).getCartBadge().getText();
		int badgeNum = Integer.parseInt(badge);
		
		int removeCount = hpe.getRemoveBtn().size();
		
		Assert.assertEquals(badgeNum,removeCount,"Remove button and Badge in cart dont match");
	}
}
