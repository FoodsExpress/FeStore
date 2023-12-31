package com.foodexpress.festore.store.subscription.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TermDuration {

    P1M("1달"),
    P1Y("1년"),
    P3Y("3년"),
    NONE("없음"),
    PERMANENCY("영구"),
    ;

    private final String duration;

}
