package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.StripeSDK;

public class StripeGateway implements PaymentGateway {

    private final StripeSDK sdk = new StripeSDK();

    @Override
    public void pay(double amount) {
        sdk.processPayment(amount);
    }
}
