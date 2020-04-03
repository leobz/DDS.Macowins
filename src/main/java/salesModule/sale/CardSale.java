package salesModule.sale;

import java.time.LocalDateTime;
import java.util.List;

import salesModule.common.CreditCard;
import salesModule.item.ClothingItem;

public class CardSale extends Sale {
	private static final double COEFFICIENT = 10;
	private int fees;
	CreditCard card;

	public CardSale(List<ClothingItem> items, LocalDateTime date, CreditCard card, int fees) {
		super(items, date);
		this.card = card;
		this.fees = fees;
	}

	public double value() {
		double price = super.value();
		double surcharge = this.fees * COEFFICIENT + itemPricePercentageSum(0.01);
		return price + surcharge;
	}

	private double itemPricePercentageSum(double COEFFICIENT) {
		return this.items().stream().mapToDouble(item -> item.price() * COEFFICIENT).sum();
	}
}
