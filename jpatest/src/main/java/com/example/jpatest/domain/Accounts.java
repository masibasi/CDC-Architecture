package com.example.jpatest.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Accounts implements Serializable {
    @Id
    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_id;
    @Column
    private String role_id;
    @Column
    private String user_name;
    @Column String user_description;
    @Column String update_date;

    @Builder
    public Accounts(Long account_id, String role_id, String user_name, String user_description, String update_date)
    {
        this.account_id = account_id;
        this.role_id = role_id;
        this.user_name = user_name;
        this.user_description = user_description;
        this.update_date = update_date;
    }
}
