package com.foodexpress.festore.common;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class UpdatedEntity extends CreatedEntity {

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private Long lastModifiedBy;

}