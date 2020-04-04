package salesModule.sale;

import java.time.LocalDateTime;
import java.util.List;
import salesModule.item.ClothingItem;

public abstract class Sale {
	private List<ClothingItem> items;
	private LocalDateTime date;

	public Sale(List<ClothingItem> items, LocalDateTime date) {
		this.items = items;
		this.date = date;
	}

	public double value() {
		double value = items.stream().mapToDouble(item -> item.price()).sum();
		return value + this.surcharge();
	}

	public abstract double surcharge();

	public int itemsQuantity() {
		return items.size();
	}

	public LocalDateTime date() {
		return this.date;
	}

	public List<ClothingItem> items() {
		return this.items;
	}
}
