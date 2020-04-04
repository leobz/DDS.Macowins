package salesModule.sale;

import java.time.LocalDateTime;
import java.util.List;
import salesModule.item.ClothingItem;

public class CardSale extends Sale {
	private static final double COEFFICIENT = 10;
	private int fees;

	public CardSale(List<ClothingItem> items, LocalDateTime date, int fees) {
		super(items, date);
		this.fees = fees;
	}

	@Override
	public double surcharge() {
		return this.fees * COEFFICIENT + itemPricePercentageSum(0.01);
	}

	private double itemPricePercentageSum(double COEFFICIENT) {
		return this.items().stream().mapToDouble(item -> item.price() * COEFFICIENT).sum();
	}
}
