package com.yougou.shop.domain;

import lombok.Data;

@Data
public class YgCart {

    /*
    private String pid         int(255) NOT NULL
    private String uid         int(255) NOT NULL
    private String name            varchar(255) NULL
    private String price           double(20,2) NULL
    private String desc            varchar(255) NULL
    private String pic1            varchar(255) NULL
    private String pic2            varchar(255) NULL
    private String pic3            varchar(255) NULL
    private String categoryId          varchar(255) NULL
    private String count           int(20) NULL*/
    private int pid;
    private int uid;
    private String name;
    private String price;
    private String desc;
    private String pic1;
    private String pic2;
    private String pic3;
    private String categoryId;
    private String count;
}
