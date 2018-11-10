package com.latheesh.study.common.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
@NoArgsConstructor
public class BaseModel {
    @CreatedDate
    @Column(name = "CREATED_DATE", updatable = false)
    private LocalDateTime createdDate;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @LastModifiedDate
    @Column(name = "LAST_UPDATED_TIME")
    private LocalDateTime lastUpdatedDate;

    @LastModifiedBy
    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    @Version
    private long version;
}
