package com.yougou.shop.api.dao;

import com.yougou.shop.domain.YgContentCategory;

import java.util.List;

public interface YgContentCategoryDao {
    /**
     * 根据parentId获取分类
     * @param parentId
     * @return
     */
    List<YgContentCategory> getBeanByParentId(Long parentId);
}
