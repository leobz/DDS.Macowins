package salesModule.item;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLiquidationClothingItem {
	final double BASE_PRICE = 10;
	
	Liquidation status;
	ClothingItem item;

	@Before
	public void init() {
		status = Liquidation.getSingletonInstance();
		item = new ClothingItem(Type.JACKET, BASE_PRICE, status);
	}

	@Test
	public void testItemPriceIsBasePriceLessDiscount() {
		Assert.assertEquals(BASE_PRICE / 2, item.price(), 0);
	}

}
