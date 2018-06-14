package com.tistory.lky1001.ethereumauthexample.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String address;

    @Column
    private String nickname;

    @Column
    private String email;
}
