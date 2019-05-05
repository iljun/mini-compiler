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
@EntityListeners({ ModifiedAuditor.class })
public class Modified extends Created {

    @Column(name = "modified_dt")
    private LocalDateTime modifiedDt;

    @Column(name = "modified_by")
    private long modifiedBy;
}
