package com.iljun.compiler.domains.source;

import com.iljun.compiler.domains.constant.Extension;
import com.iljun.compiler.domains.common.Modified;
import lombok.Data;

import javax.persistence.*;

@Table(name = "source")
@Data
@Entity
public class Source extends Modified {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "source_id")
    private long sourceId;

    @Column(name = "extension_code")
    private Extension extension;

    @Column(name = "content_path")
    private String contentPath;


}
