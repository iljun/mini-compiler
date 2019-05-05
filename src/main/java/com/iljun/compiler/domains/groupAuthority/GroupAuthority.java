package com.iljun.compiler.domains.groupAuthority;

import com.iljun.compiler.domains.group.Group;
import com.iljun.compiler.domains.user.User;

import javax.persistence.*;

@Entity
public class GroupAuthority {

    @Id
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

    @Id
    @Column(name = "authority_code")
    private GroupAuthority groupAuthority;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
