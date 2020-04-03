package salesModule.sale;

import java.time.LocalDateTime;
import java.util.List;

import salesModule.item.ClothingItem;

public class CashSale extends Sale {

	public CashSale(List<ClothingItem> items, LocalDateTime date) {
		super(items, date);
	}

}
