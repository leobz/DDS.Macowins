package salesModule.item;

public class ClothingItem {

	private int id;
	private double basePrice;
	private ItemStatus status;
	
	public ClothingItem(int id, double basePrice, ItemStatus status) {
		this.id = id;
		this.basePrice = basePrice;
		this.status = status;
	}
	
	public double price() {
		return status.price(this.basePrice);
	}

}
