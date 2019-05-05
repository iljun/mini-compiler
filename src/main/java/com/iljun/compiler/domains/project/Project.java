package com.iljun.compiler.domains.project;

import com.iljun.compiler.domains.common.Modified;
import com.iljun.compiler.domains.group.Group;
import com.iljun.compiler.domains.module.Module;
import com.iljun.compiler.domains.source.Source;
import com.iljun.compiler.domains.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Entity
@Table(name = "project")
public class Project extends Modified {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "project_id")
    private long projectId;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @OneToMany
    private Map<String, Module> modules;

    @OneToMany
    private Map<String, Source> sources;

    @OneToMany
    @Column(name = "user_id", nullable = true)
    private List<User> users;
}
