package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class PayPal {
	public void sendPayment(String creditCardNumber, double amount)
	{
		System.out.println("Paypal: Charging " + creditCardNumber + " " + amount + "€");
	}
}
