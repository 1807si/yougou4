package com.yougou.shop.api.dao;

import com.yougou.shop.domain.YgLunbo;

import java.util.List;

public interface YgLunboDao {
    /**
     * 获取轮播图
     * @return
     */
    List<YgLunbo> getLunbo();
}
