package com.foodexpress.festore.store.subscription.entity;

import com.foodexpress.festore.store.entity.Store;
import com.foodexpress.festore.store.subscription.enums.PaymentMethod;
import com.foodexpress.festore.store.subscription.enums.SubscriptionStatus;
import com.foodexpress.festore.store.subscription.enums.TermDuration;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StoreSubscription {

    @Id
    private Long id;

    private String uuid;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    /**
     * 용어 기간의 ISO 8601 표현입니다. 현재 지원되는 값은 P1M(1 개월), P1Y (1년) 및 P3Y (3년)입니다.
     */
    private TermDuration termDuration;
    /**
     * <p>지불방식</p>
     */
    private PaymentMethod paymentMethod;

    /**
     * 취소 가능일자
     */
    private LocalDate cancellationAllowedUntilDate;

    /**
     * 구독 상태
     */
    private SubscriptionStatus status;
    /**
     * 구독이 자동으로 갱신되는지 여부를 나타내는 값을 가져옵니다.
     */
    private boolean autoRenewEnabled;

    /**
     * 평가판 구독인지 여부를 나타내는 값입니다.
     */
    private boolean isTrial;

}
