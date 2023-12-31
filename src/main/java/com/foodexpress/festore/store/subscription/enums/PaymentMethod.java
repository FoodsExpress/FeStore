package com.foodexpress.festore.store.subscription.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 지불 방식 enums
 */
@Getter
@AllArgsConstructor
public enum PaymentMethod {
    CARD("카드"),
    ACCOUNT_TRANSFER("계좌이체"),
    ;
    private final String methodName;

}
