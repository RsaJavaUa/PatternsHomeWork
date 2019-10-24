package checkobjects;

import payments.BudgetPayment;
import payments.InnerBankPayment;
import payments.Payment;
import payments.RegularPayment;

public class ByTypePaymentChecker extends PaymentChecker {
    @Override
    public boolean operate(Payment payment) {
        doAccordingType(payment);
        return checkNext(payment);
    }

    private void doAccordingType(Payment payment) {
        if (payment instanceof BudgetPayment) {
            System.out.println("Operating with budget Payment");
        } else if (payment instanceof RegularPayment) {
            System.out.println("Operating with regular Payment");

        } else if (payment instanceof InnerBankPayment) {
            System.out.println("Operating with inner bank Payment");
        }
    }
}
