package com.yougou.shop.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class YgContentCategory implements Serializable {


   /*
        id          bigint(20) NOT NULL
        parent_id   bigint(20) NULL
        name            varchar(50) NULL
        is_parent   tinyint(1) NULL
        update      datetime NULL*/
    public Long id;
    public Long parentId;
    public String name;
    public Boolean isParent;
    public Date update;
}
