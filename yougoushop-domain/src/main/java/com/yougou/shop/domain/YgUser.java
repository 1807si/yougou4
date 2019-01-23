package com.yougou.shop.domain;

import lombok.Data;

import java.io.Serializable;
@Data
public class YgUser implements Serializable {

    /*
    private String id          int(255) NOT NULL
    private String username            varchar(50) NULL
    private String password            varchar(255) NULL
    private String phone           varchar(50) NULL
    private String email               varchar(50) NULL
    private String address         varchar(255) NULL*/
    private int id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String address;
}
