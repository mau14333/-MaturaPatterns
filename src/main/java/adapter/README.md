#Adapter Pattern
The idea behind this implementation is that we have customers that want to pay for something and would like to use different payment providers (Stripe and Paypal in this example) to do so.

###Why?
Since Stripe and Paypal both have different APIs, as demonstrated in the classes Stripe and Payment, we need an adapter to be able to work with both through one interface.

###Realisation
We have to the payment providers. Both with their API that has a method to pay. The class PaymentAdapter has the information on how these APIs are set up and knows which providers exist.

The goal is to call the PaymentAdapter and tell him that a customer wants to pay via Payment or Stripe. And function call will look like this:

```java
        PaymentAdapter payment = new PaymentAdapter();
        //Paypal
        payment.pay(PaymentAdapter.Providers.PayPal, customer, 12.5f);
        //Stripe
        payment.pay(PaymentAdapter.Providers.Stripe, customer, 7.5f);

```

`PaymentAdapter.Providers` is an enum with which the Adapter decides which provider is used.