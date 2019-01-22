package com.yougou.shop.api.web.dto;

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
