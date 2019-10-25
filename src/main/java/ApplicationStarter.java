import builders.DefaultPaymentCheckerBuilder;
import checkobjects.PaymentChecker;
import payments.InnerBankPayment;

public class ApplicationStarter {
    public static void main(String[] args) {
        DefaultPaymentCheckerBuilder defaultPaymentCheckerBuilder = new DefaultPaymentCheckerBuilder();
        PaymentChecker paymentChecker = defaultPaymentCheckerBuilder.build();

        InnerBankPayment bankPayment = new InnerBankPayment(100.00);

        paymentChecker.operate(bankPayment);
    }
}
