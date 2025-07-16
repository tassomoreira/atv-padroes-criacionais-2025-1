package br.edu.ifpb.ads.padroes.atv2.gateway;

import br.edu.ifpb.ads.padroes.atv2.sdk.PagSeguroSDK;

public class PagSeguroGateway implements PaymentGateway {

    private final PagSeguroSDK sdk = new PagSeguroSDK();

    @Override
    public void pay(double amount) {
        sdk.processPayment(amount);
    }
}
