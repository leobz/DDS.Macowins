package salesModule.item;

public class Liquidation extends ItemStatus {
	private static Liquidation singleton;

	private Liquidation() {
	}

	public static Liquidation getSingletonInstance() {
		if (singleton == null) {
			singleton = new Liquidation();
		}
		return singleton;
	}

	@Override
	public double price(double price) {
		return price * 0.5;
	}

}
