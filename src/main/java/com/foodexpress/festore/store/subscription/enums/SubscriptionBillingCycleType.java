package com.foodexpress.festore.store.subscription.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubscriptionBillingCycleType {

    UNKNOWN("알수 없음"),
    MONTHLY("매월"),
    ANNUAL("매년"),
    NONE("없음"),
    ONE_TIME("한번만"),
    TRIENNIAL("3년마다"),
    ;
    private final String billingCycleType;
    
}
