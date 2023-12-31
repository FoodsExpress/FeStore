package com.foodexpress.festore.store.subscription.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SubscriptionStatus {

    NONE("없음"),
    ACTIVE("활성"),
    PENDING("보류"),
    SUSPENDED("중단됨"),
    EXPIRED("만료"),
    DELETED("삭제"),
    DISABLED("중단됨"),
    ;
    private final String status;
}
