package salesModule.item;

public class Promotion extends ItemStatus {
	double discount;
	
	public Promotion(double discount) {
		this.discount = discount;
	}

	@Override
	public double price(double price) {
		return price - discount;
	}

}
