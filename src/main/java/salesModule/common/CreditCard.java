package salesModule.common;

import static salesModule.common.Commons.currentDate;

import java.util.Date;

public class CreditCard {
	String company;
	String cardholder;
	int number;
	int security_code;
	Date expiration;
	
	public CreditCard(
			String company,
			String cardholder,
			int number,
			int security_code,
			Date expiration) {
	}
	
	public static CreditCard exampleCard() {
		return new CreditCard("Visa", "Leonel Bazan", 12345678, 123, currentDate());
	}
	
	boolean hasFunds(){
		return true;
	}
	
	void makePayment() {
	}
	
}
