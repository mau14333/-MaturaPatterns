package adapter;

/**
 * Created by Daniel on 09/05/15.
 */
public class Stripe {
	public void charge(String creditCardHolder, String creditCardNumber, String cvc, float amount)
	{
		System.out.println("Stripe: Charging " + creditCardHolder + " (" + creditCardNumber + ")" + " " + amount + "€");
	}
}
