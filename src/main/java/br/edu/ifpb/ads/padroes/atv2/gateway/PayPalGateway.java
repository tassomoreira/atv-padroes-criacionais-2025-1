package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PayPalSDK;

public class PayPalGateway implements PaymentGateway {

    private final PayPalSDK sdk = new PayPalSDK();

    @Override
    public void pay(double amount) {
        sdk.processPayment(amount);
    }
}
