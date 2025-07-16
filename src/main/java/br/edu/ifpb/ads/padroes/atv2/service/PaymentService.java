package br.edu.ifpb.ads.padroes.atv2.service;

import br.edu.ifpb.ads.padroes.atv2.gateway.PaymentGateway;
import com.google.inject.Inject;

public class PaymentService {

    private final PaymentGateway gateway;

    @Inject
    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void pay(double amount) {
        gateway.pay(amount);
    }
}
