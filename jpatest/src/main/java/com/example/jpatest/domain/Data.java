package com.example.jpatest.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Table(name="CUSTOM_TABLE")
public class Data implements Serializable {
    @Id
    @Column
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String name;


    @Builder
    public Data(Long id, String title, String name)
    {
        this.id = id;
        this.title = title;
        this.name = name;

    }
}
