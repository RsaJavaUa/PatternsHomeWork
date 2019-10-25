package checkobjects;

import payments.Payment;

public interface PaymentOperatorInterface {
    public abstract boolean operate(Payment payment);
}
