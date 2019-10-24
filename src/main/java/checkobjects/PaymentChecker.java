package checkobjects;

import payments.Payment;

public abstract class PaymentChecker implements PaymentOperatorInterface {
    private PaymentChecker next;

    public PaymentChecker linkWith(PaymentChecker next) {
        this.next = next;
        return next;
    }

    public abstract boolean operate(Payment payment);

    protected boolean checkNext(Payment payment) {
        if (next == null) {
            return true;
        } else return next.operate(payment);
    }
}
