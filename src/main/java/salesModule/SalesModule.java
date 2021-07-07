package salesModule;

import java.util.List;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;
import salesModule.item.ClothingItem;
import salesModule.sale.CardSale;
import salesModule.sale.CashSale;
import salesModule.sale.Sale;
import static salesModule.common.Commons.currentDateAndTime;;

public class SalesModule {
	private static SalesModule singleton;
	private List<Sale> sales = new ArrayList<>();

	private SalesModule() {
	}

	public static SalesModule getSingletonInstance() {
		if (singleton == null) {
			singleton = new SalesModule();
		}
		return singleton;
	}

	public double earningsOfTheDay(LocalDateTime wantedDay) {
		List<Sale> daySales = sales.stream().filter(sale -> sale.date().until(wantedDay, ChronoUnit.DAYS) == 0)
				.collect(Collectors.toList());

		return daySales.stream().mapToDouble(sale -> sale.value()).sum();
	}

	public void cashPayment(List<ClothingItem> items) {
		CashSale cashSale = new CashSale(items, currentDateAndTime());
		registerSale(cashSale);
	}

	public void cardPayment(List<ClothingItem> items, int fees) {
		CardSale cardSale = new CardSale(items, currentDateAndTime(), fees);
		registerSale(cardSale);
	}

	public void registerSale(Sale sale) {
		this.sales.add(sale);
	}

	public int quantityOfSales() {
		return this.sales.size();
	}

	public void restartSales() {
		this.sales = new ArrayList<>();
	}
}