package salesModule.sale;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import salesModule.item.ClothingItem;
import salesModule.item.New;
import salesModule.item.Type;

public class TestCardSale {
	final int FEES = 3;
	final double COEFFICIENT = CardSale.coefficient();
	List<ClothingItem> shoppingCart;
	ClothingItem itemWithPriceEqualToTen;
	ClothingItem itemWithPriceEqualToTwenty;
	CardSale sale;

	@Before
	public void init() {
		shoppingCart = new ArrayList<ClothingItem>();
		itemWithPriceEqualToTen = new ClothingItem(Type.SHIRT, 10, New.getSingletonInstance());
		itemWithPriceEqualToTwenty = new ClothingItem(Type.SHIRT, 20, New.getSingletonInstance());
	}

	@Test
	public void valueOfSaleIsGreatherThatTheSumOfYourItemsPrices() {
		shoppingCart.add(itemWithPriceEqualToTen);
		shoppingCart.add(itemWithPriceEqualToTwenty);
		CardSale sale = new CardSale(shoppingCart, LocalDateTime.now(), FEES);

		Assert.assertTrue(sale.value() > 30);
	}

	@Test
	public void valueOfSaleIsEqualsToTheSumOfYourItemsPricesPlusASurcharge() {
		shoppingCart.add(itemWithPriceEqualToTen);
		shoppingCart.add(itemWithPriceEqualToTen);
		CardSale sale = new CardSale(shoppingCart, LocalDateTime.now(), FEES);

		double surcharge = FEES * COEFFICIENT + (0.02 * 10);

		Assert.assertEquals(20 + surcharge, sale.value(), 0);
	}

}
