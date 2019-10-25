package checkobjects;

import payments.Payment;

public class BankPercentageCharger extends PaymentChecker {

    private double chargeSize = 0.05;

    @Override
    public boolean operate(Payment payment) {

        System.out.println("Charge " + chargeSize + "  is taken.");
        payment.setAmount(payment.getAmount() * (1 - chargeSize));
        return checkNext(payment);
    }
}
