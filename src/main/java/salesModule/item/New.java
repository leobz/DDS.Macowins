package salesModule.item;

public class New extends ItemStatus {
	private static New singleton;
	
	private New() {
	}
	
	public static New getSingletonInstance() {
		if (singleton == null){
        	singleton = new New();
        }
        return singleton;
	}
	
	@Override
	public double price(double price) {
		return price;
	}

}
