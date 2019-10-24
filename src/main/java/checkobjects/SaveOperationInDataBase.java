package checkobjects;

import payments.Payment;

public class SaveOperationInDataBase extends PaymentChecker {
    @Override
    public boolean operate(Payment payment) {
        System.out.println("Saving in data base");
        return checkNext(payment);
    }
}
