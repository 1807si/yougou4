package com.yougou.shop.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class YgContentCategoryDTO implements Serializable {
    public Long id;
    public String name;
}
