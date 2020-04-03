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

	public int itemsQuantity() {
		return items.size();
	}

	public double value() {
		return items.stream().mapToDouble(item -> item.price()).sum();
	}

	public LocalDateTime date() {
		return this.date;
	}

	public List<ClothingItem> items() {
		return this.items;
	}
}
