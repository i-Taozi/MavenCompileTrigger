package io.sphere.sdk.orderedits.commands.stagedactions;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.sphere.sdk.models.Reference;
import io.sphere.sdk.models.Referenceable;
import io.sphere.sdk.payments.Payment;

import java.util.Optional;

public final class AddPayment extends OrderEditStagedUpdateActionBase {

    private final Reference<Payment> payment;

    @JsonCreator
    private AddPayment(final Reference<Payment> payment) {
        super("addPayment");
        this.payment = payment;
    }

    public static AddPayment of(final Referenceable<Payment> payment) {
        return new AddPayment(Optional.ofNullable(payment).map(Referenceable::toReference).orElse(null));
    }

    public Reference<Payment> getPayment() {
        return payment;
    }
}