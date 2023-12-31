package com.foodexpress.festore.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 가게 상태를 나타내는 enum
 *
 * @author seunggu.lee
 * @since 1.0
 */
@Getter
@AllArgsConstructor
public enum StoreStatus {
    
    PENDING("심사중"),
    REJECT("거절"),
    NORMAL("정상"),
    /**
     * <p>휴점 상태</p>
     * <p>잠시 가게를 쉬는 상태를 뜻하며, 추후 다시 심사를 통해 정상으로 돌릴 수 있다.</p>
     */
    TEMPORARILY_CLOSED("휴점"),
    /**
     * <p>폐점 상태</p>
     * <p>가게가 아예 문 닫은 상태를 뜻하며, 다시 되돌릴 수 없는 상태를 말한다.</p>
     */
    PERMANENTLY_CLOSED("폐점"),
    ;

    private final String status;

}
