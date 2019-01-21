package com.yougou.shop.ui.dto;

import lombok.Data;

@Data
public class YgContentDTO {
    public Long id;
    public String name;
    public Double price;
    public String desc;
    public String pic1;
    public String pic2;
    public String pic3;
    public YgContentCategoryDTO ygContentCategoryDTO;
}
