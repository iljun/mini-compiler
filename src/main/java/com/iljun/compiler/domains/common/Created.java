package com.iljun.compiler.domains.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners({ CreatedAuditor.class })
public class Created {

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by")
    private long createdBy;
}
