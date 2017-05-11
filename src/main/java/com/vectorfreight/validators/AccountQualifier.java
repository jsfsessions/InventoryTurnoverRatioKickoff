package com.vectorfreight.validators;

import com.vectorfreight.entity.old.Order;
import com.vectorfreight.entity.old.User;
import com.vectorfreight.eum.AccountStatus;
import com.vectorfreight.helper.Exemptable;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = AccountQualifier.AccountQualifierValidator.class)
public @interface AccountQualifier {

    String message() default "{com.vectorfreight.validators.accountqualifier.AccountQualifier.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    class AccountQualifierValidator implements ConstraintValidator<AccountQualifier, Order> {

        Order order;

        @Override
        public void initialize(AccountQualifier annotation) {
        }

        @Override
        public boolean isValid(Order order, ConstraintValidatorContext context) {
            return isAccountInGoodStanding(currentUser -> currentUser.getAccountStatus().equals(AccountStatus.LOCKED));
        }

        private boolean isAccountInGoodStanding(Exemptable ex) {
            // return ex.isExempt(order.getAccountHolder());
            return true;
        }
    }
}
