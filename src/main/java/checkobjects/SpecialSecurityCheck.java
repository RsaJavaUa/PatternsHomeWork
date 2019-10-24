package checkobjects;

import payments.Payment;

public class SpecialSecurityCheck extends PaymentChecker {

    private boolean specialCondition = true;

    public boolean isSpecialCondition() {
        return specialCondition;
    }

    public void setSpecialCondition(boolean specialCondition) {
        this.specialCondition = specialCondition;
    }

    @Override
    public boolean operate(Payment payment) {
        System.out.println("Special security check is taking place...");
        if (!specialCondition) {
            System.out.println("Security check has failed");
            return false;
        }
        System.out.println("Security check finished successfully");
        return checkNext(payment);
    }
}
