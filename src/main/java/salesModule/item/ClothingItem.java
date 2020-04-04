package salesModule.item;

public class ClothingItem {

	private Type type;
	private double basePrice;
	private ItemStatus status;
	
	public ClothingItem(Type type, double basePrice, ItemStatus status) {
		this.type = type;
		this.basePrice = basePrice;
		this.status = status;
	}
	
	public double price() {
		return status.price(this.basePrice);
	}

	public Type type() {
		return type;
	}
}
