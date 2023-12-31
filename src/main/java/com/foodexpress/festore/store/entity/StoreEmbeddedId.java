package com.foodexpress.festore.store.entity;

import com.foodexpress.festore.account.entity.Account;
import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
public class StoreEmbeddedId implements Serializable {

    /**
     * 사업자 등록 번호
     */
    private String bizNo;

    /**
     * 점주 식별자
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

}
