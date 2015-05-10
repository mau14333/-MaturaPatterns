package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class StripeAdapter implements PaymentAdapter{
	public void pay(Customer customer, float amount)
	{
		Stripe stripe = new Stripe();
		stripe.charge(customer.getCreditCardHolder(), customer.getCreditCardNumber(), customer.getCvc(), amount);
	}
}
