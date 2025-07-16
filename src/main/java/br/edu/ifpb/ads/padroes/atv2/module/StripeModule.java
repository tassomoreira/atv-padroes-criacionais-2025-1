package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PaymentGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.StripeGateway;
import com.google.inject.AbstractModule;

public class StripeModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PaymentGateway.class).to(StripeGateway.class);
    }
}
