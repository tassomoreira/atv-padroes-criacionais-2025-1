package br.edu.ifpb.ads.padroes.atv2.module;

import br.edu.ifpb.ads.padroes.atv2.gateway.PagSeguroGateway;
import br.edu.ifpb.ads.padroes.atv2.gateway.PaymentGateway;
import com.google.inject.AbstractModule;

public class PagSeguroModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(PaymentGateway.class).to(PagSeguroGateway.class);
    }
}
