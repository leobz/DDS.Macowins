package salesModule;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Collectors;

import org.joda.time.DateTime;
import org.joda.time.Days;

import salesModule.common.CreditCard;
import salesModule.item.ClothingItem;
import salesModule.sale.CardSale;
import salesModule.sale.CashSale;
import salesModule.sale.Sale;
import static salesModule.common.Commons.currentDate;;

public class SalesModule {
	private static SalesModule singleton;
	private List<Sale> sales = new ArrayList<>();
	private List<ClothingItem> clothingItems = new ArrayList<>();

	private SalesModule() {
	}

	public static SalesModule getSingletonInstance() {
		if (singleton == null) {
			singleton = new SalesModule();
		}
		return singleton;
	}

	public double earningsOfTheDay(Date _wantedDay) {
		DateTime wantedDay = new DateTime(_wantedDay);
		List<Sale> daySales = sales.stream()
				.filter(sale -> Days.daysBetween(new DateTime(sale.date()), wantedDay).getDays() == 0)
				.collect(Collectors.toList());

		return daySales.stream().mapToDouble(sale -> sale.value()).sum();
	}

	public void cashPayment(List<ClothingItem> items) {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		Date date = calendar.getTime();
		CashSale cashSale = new CashSale(items, date);
		registerSale(cashSale);
	}

	public void cardPayment(List<ClothingItem> items, CreditCard card, int fees) {
		CardSale cardSale = new CardSale(items, currentDate(), card, fees);
		registerSale(cardSale);
	}

	public void registerSale(Sale sale) {
		this.sales.add(sale);
	}

}