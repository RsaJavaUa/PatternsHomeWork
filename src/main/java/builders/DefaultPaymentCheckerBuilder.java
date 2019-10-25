package builders;

import checkobjects.BankPercentageCharger;
import checkobjects.ByTypePaymentChecker;
import checkobjects.PaymentChecker;
import checkobjects.SaveOperationInDataBase;
import checkobjects.SpecialSecurityCheck;
import checkobjects.ValidateAccountsPayment;

public class DefaultPaymentCheckerBuilder implements PaymentCheckerBuilder {

    @Override
    public PaymentChecker build() {
        PaymentChecker paymentChecker = new ValidateAccountsPayment();
         paymentChecker.linkWith(new SpecialSecurityCheck())
                .linkWith(new ByTypePaymentChecker())
                .linkWith(new BankPercentageCharger())
                .linkWith(new SaveOperationInDataBase());
         return paymentChecker;

    }
}
