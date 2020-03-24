package salesModule.item;

public class ClothingItem {

	int id;
	double base_price;
	ItemStatus status;
	
	public ClothingItem(int id, double base_price, ItemStatus status) {
		this.id = id;
		this.base_price = base_price;
		this.status = status;
	}
	
	public double price() {
		return status.price(this.base_price);
	}

}
