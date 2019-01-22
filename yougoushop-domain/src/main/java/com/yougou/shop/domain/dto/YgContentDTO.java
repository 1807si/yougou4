package com.yougou.shop.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class YgContentDTO implements Serializable {
    public Long id;
    public String name;
    public Double price;
    public String desc;
    public String pic1;
    public String pic2;
    public String pic3;
    public YgContentCategoryDTO ygContentCategoryDTO;
}
