package com.iljun.compiler.domains.group;

import com.iljun.compiler.domains.constant.GroupAuthority;
import com.iljun.compiler.domains.common.Modified;
import com.iljun.compiler.domains.project.Project;
import com.iljun.compiler.domains.user.User;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "group")
public class Group extends Modified {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "group_id")
    private long groupId;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @OneToMany
    private List<GroupAuthority> groupAuthorities;

    @OneToMany
    private List<Project> projects;
}
