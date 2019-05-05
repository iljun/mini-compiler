package com.iljun.compiler.domains.common;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;

public class CreatedAuditor {

    @PrePersist
    private void setCreated(Created created) {
        created.setCreatedAt(LocalDateTime.now());
        // TODO User PK
        created.setCreatedBy(1L);
    }
}
