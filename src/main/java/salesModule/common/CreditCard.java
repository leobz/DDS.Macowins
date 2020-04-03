package salesModule.common;

import static salesModule.common.Commons.currentDateAndTime;

import java.time.LocalDateTime;

public class CreditCard {
	private String company;
	private String cardholder;
	private int number;
	private int securityCode;
	private LocalDateTime expiration;
	
	public CreditCard(
			String company,
			String cardholder,
			int number,
			int securityCode,
			LocalDateTime expiration) {
	}
	
	public static CreditCard exampleCard() {
		return new CreditCard("Visa", "Leonel Bazan", 12345678, 123, currentDateAndTime());
	}
	
	boolean hasFunds(){
		return true;
	}
	
	void makePayment() {
	}
	
}
