package com.foodexpress.festore.store.entity;

import com.foodexpress.festore.common.Address;
import com.foodexpress.festore.common.UpdatedEntity;
import com.foodexpress.festore.franchise.entity.Franchise;
import com.foodexpress.festore.store.enums.StoreStatus;
import com.foodexpress.festore.store.subscription.entity.StoreSubscription;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Store extends UpdatedEntity {

    @EmbeddedId
    private StoreEmbeddedId storeEmbeddedId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Franchise franchise;

    /**
     * 상호명
     */
    @Column(columnDefinition = "varchar(100)")
    private String name;

    /**
     * 가게 상태
     */
    private StoreStatus storeStatus;

    /**
     * <p>가게 시작 일자.</p>
     * <p>가게가 최초로 영업을 시작하게 된 날짜를 말한다.</p>
     */
    private LocalDate startDate;

    /**
     * <p>최소 주문 금액.</p>
     * 최소금액은 아주 적기 때문에 int 타입으로 설정.
     */
    private int minimumOrderPrice;

    /**
     * 원산지 정보 표기
     */
    @Column(columnDefinition = "varchar(max)")
    private String origin;

    @Embedded
    private Address address;

    /**
     * 구독 목록
     */
    @OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
    private List<StoreSubscription> storeSubscriptionList;

}
