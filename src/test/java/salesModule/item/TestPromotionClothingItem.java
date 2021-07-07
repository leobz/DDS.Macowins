package salesModule.item;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPromotionClothingItem {
	final double DISCOUNT_OF_PROMOTION = 2;
	final double BASE_PRICE = 10;
	Promotion status;
	ClothingItem item;

	@Before
	public void init() {
		status = new Promotion(DISCOUNT_OF_PROMOTION);
		item = new ClothingItem(Type.JACKET, BASE_PRICE, status);
	}

	@Test
	public void testItemPriceIsBasePriceLessDiscount() {
		Assert.assertEquals(BASE_PRICE - DISCOUNT_OF_PROMOTION, item.price(), 0);
	}
}
