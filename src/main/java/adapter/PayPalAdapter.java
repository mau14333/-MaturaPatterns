package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class PayPalAdapter implements PaymentAdapter{
	public void pay(Customer customer, float amount)
	{
		PayPal payPal = new PayPal();
		payPal.sendPayment(customer.getCreditCardNumber(), (double) amount);
	}
}
