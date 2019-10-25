package checkobjects;

import payments.Payment;

public class ValidateAccountsPayment extends PaymentChecker{
    @Override
    public boolean operate(Payment payment) {
        System.out.println("Validating accounts");
        if (checkLenghtOfAccounts(payment) || equalityOfAccounts(payment)) {
            System.out.println("Validation failed");
            return false;
        }
        System.out.println("Validation successful");
        return checkNext(payment);
    }

    private boolean checkLenghtOfAccounts(Payment payment) {
        int length = payment.getAccountTo().length();
        return payment.getAccountFrom().length() != 12 || payment.getAccountTo().length() != 12 ;
    }

    private boolean equalityOfAccounts(Payment payment){
        return payment.getAccountTo().equals(payment.getAccountFrom());
    }
}


