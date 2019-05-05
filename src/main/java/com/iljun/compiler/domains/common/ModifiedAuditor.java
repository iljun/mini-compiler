package com.iljun.compiler.domains.common;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class ModifiedAuditor {

    @PrePersist
    @PreUpdate
    private void setModified(Modified modified) {
        modified.setModifiedDt(LocalDateTime.now());
        // TODO User PK
        modified.setModifiedBy(1L);
    }
}
