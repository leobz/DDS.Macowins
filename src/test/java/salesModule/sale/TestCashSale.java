package salesModule.sale;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;
import salesModule.item.ClothingItem;
import salesModule.item.New;
import salesModule.item.Type;

public class TestCashSale {
	CashSale sale;
	List<ClothingItem> shoppingCart;
	ClothingItem itemWithPriceEqualToTen;
	ClothingItem itemWithPriceEqualToTwenty;

	@Before
	public void init() {
		shoppingCart = new ArrayList<ClothingItem>();
		itemWithPriceEqualToTen = new ClothingItem(Type.SHIRT, 10, New.getSingletonInstance());
		itemWithPriceEqualToTwenty = new ClothingItem(Type.SHIRT, 20, New.getSingletonInstance());
	}

	@Test
	public void valueOfSaleIsEqualsToTheSumOfYourItemsPrices() {
		shoppingCart.add(itemWithPriceEqualToTen);
		shoppingCart.add(itemWithPriceEqualToTwenty);
		CashSale sale = new CashSale(shoppingCart, LocalDateTime.now());

		Assert.assertEquals(30, sale.value(), 0);
	}
}
