package com.iljun.compiler.domains.module;

import com.iljun.compiler.domains.common.Modified;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "module")
public class Module extends Modified {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "module_id")
    private long moduleId;

    // TODO Module에 필요한 정보 추가
}
