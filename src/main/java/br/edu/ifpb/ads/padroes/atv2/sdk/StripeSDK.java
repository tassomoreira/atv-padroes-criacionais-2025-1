package br.edu.ifpb.ads.padroes.atv2.sdk;

public class StripeSDK {

    public void processPayment(double amount) {
        System.out.println("Transação concluída: R$" + amount + " enviados via Stripe");
    }
}
