package com.foodexpress.festore.franchise.entity;

import com.foodexpress.festore.store.entity.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Franchise {

    @Id
    private Long id;

    private String uuid;
    
    @OneToMany(mappedBy = "franchise", fetch = FetchType.LAZY)
    private List<Store> storeList;

}
