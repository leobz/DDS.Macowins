package salesModule;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import salesModule.item.ClothingItem;
import salesModule.item.New;
import salesModule.item.Type;

public class TestSalesModule {
	SalesModule salesModule;
	List<ClothingItem> items;

	@Before
	public void init() {
		salesModule = SalesModule.getSingletonInstance();
		items = new ArrayList<ClothingItem>();
		items.add(new ClothingItem(Type.JACKET, 10, New.getSingletonInstance()));
	}

	@After
	public void after() {
		salesModule.restartSales();
	}

	@Test
	public void testCashPaymentRegisterTheSales() {
		salesModule.cashPayment(items);
		salesModule.cashPayment(items);

		Assert.assertEquals(2, salesModule.quantityOfSales());
	}

	@Test
	public void testCardPaymentRegisterTheSales() {
		salesModule.cardPayment(items, 1);

		Assert.assertEquals(1, salesModule.quantityOfSales());
	}

	@Test
	public void testEarningsOfTheDayIsEqualsToTheSumOfTheSalesValues() {
		salesModule.cashPayment(items);
		salesModule.cashPayment(items);

		Assert.assertEquals(20, salesModule.earningsOfTheDay(LocalDateTime.now()), 0);
	}

}
