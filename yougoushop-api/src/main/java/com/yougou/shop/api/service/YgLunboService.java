package com.yougou.shop.api.service;

import com.yougou.shop.domain.YgLunbo;

import java.util.List;

public interface YgLunboService {
    /**
     * 获取轮播图
     * @return
     */
    List<YgLunbo> getLunbo();
}
