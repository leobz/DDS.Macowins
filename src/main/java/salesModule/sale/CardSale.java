package salesModule.sale;

import java.util.Date;
import java.util.List;

import salesModule.common.CreditCard;
import salesModule.item.ClothingItem;

public class CardSale extends Sale {
	private static final double COEFFICIENT = 10;
	int fees;
	CreditCard card;

	public CardSale(List<ClothingItem> items, Date date, CreditCard card, int fees) {
		super(items, date);
		this.card = card;
		this.fees = fees;
	}

	public double value() {
		double price = super.value();
		double surcharge = this.fees * COEFFICIENT + itemPricePercentageSum(0.01);
		return price + surcharge;
	}

	public double itemPricePercentageSum(double COEFFICIENT) {
		return items.stream().mapToDouble(item -> item.price() * COEFFICIENT).sum();
	}
}
