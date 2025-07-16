package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.module.PagSeguroModule;
import br.edu.ifpb.ads.padroes.atv2.module.PayPalModule;
import br.edu.ifpb.ads.padroes.atv2.module.StripeModule;
import br.edu.ifpb.ads.padroes.atv2.service.PaymentService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injectorPayPal = Guice.createInjector(new PayPalModule());
        PaymentService PayPalPayment = injectorPayPal.getInstance(PaymentService.class);
        PayPalPayment.pay(300.0);

        Injector injectorPagSeguro = Guice.createInjector(new PagSeguroModule());
        PaymentService PagSeguroPayment = injectorPagSeguro.getInstance(PaymentService.class);
        PagSeguroPayment.pay(200.0);

        Injector injectorStripe = Guice.createInjector(new StripeModule());
        PaymentService stripePayment = injectorStripe.getInstance(PaymentService.class);
        stripePayment.pay(100.0);
    }
}
