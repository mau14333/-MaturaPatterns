package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class Customer {
	private String creditCardNumber;
	private String creditCardHolder;
	private String cvc;

	public Customer(String creditCardHolder, String creditCardNumber, String cvc)
	{
		this.creditCardNumber = creditCardNumber;
		this.creditCardHolder = creditCardHolder;
		this.cvc = cvc;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getCreditCardHolder() {
		return creditCardHolder;
	}

	public String getCvc() {
		return cvc;
	}
}
