package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class PaymentAdapter {
	public enum Providers {
		Stripe,
		PayPal
	}

	public void pay(Providers provider, Customer customer, float amount)
	{
		if(provider.equals(Providers.PayPal))
		{
			PayPal payPal = new PayPal();
			payPal.sendPayment(customer.getCreditCardNumber(), (double) amount);
		}

		if(provider.equals(Providers.Stripe))
		{
			Stripe stripe = new Stripe();
			stripe.charge(customer.getCreditCardHolder(), customer.getCreditCardNumber(), customer.getCvc(), amount);
		}
	}
}
