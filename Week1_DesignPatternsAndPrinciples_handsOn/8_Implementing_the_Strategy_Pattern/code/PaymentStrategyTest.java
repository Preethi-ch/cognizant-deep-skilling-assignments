public class PaymentStrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();


        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.executePayment(150.0);

    
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.executePayment(75.5);
    }
}
