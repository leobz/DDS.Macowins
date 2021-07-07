package salesModule.item;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestNewClothingItem {
	final double BASE_PRICE = 10;
	New status;
	ClothingItem item;

	@Before
	public void init() {
		status = New.getSingletonInstance();
		item = new ClothingItem(Type.JACKET, BASE_PRICE, status);
	}

	@Test
	public void testPriceIsEqualsToTheBasePrice() {
		Assert.assertEquals(BASE_PRICE, item.price(), 0);
	}

}
