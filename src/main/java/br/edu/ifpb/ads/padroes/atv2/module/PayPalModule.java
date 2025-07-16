package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PayPalGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PaymentGateway;
import com.google.inject.AbstractModule;

public class PayPalModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PaymentGateway.class).to(PayPalGateway.class);
    }
}
