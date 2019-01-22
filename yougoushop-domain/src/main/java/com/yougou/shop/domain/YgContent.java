package com.yougou.shop.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class YgContent implements Serializable {
    public Long id;
    public Long categoryId ;
    public String name;
    public Double price;
    public String desc;
    public String pic1;
    public String pic2;
    public String pic3;
}
