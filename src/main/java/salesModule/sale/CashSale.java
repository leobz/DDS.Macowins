package salesModule.sale;

import java.util.Date;
import java.util.List;

import salesModule.item.ClothingItem;

public class CashSale extends Sale {

	public CashSale(List<ClothingItem> items, Date date) {
		super(items, date);
	}

}
