package com.yougou.shop.api.service;


import com.yougou.shop.domain.dto.YgContentCategoryDTO;

import java.util.List;

public interface YgContentCategoryService {
    /**
     * 根据parentId获取分类
     * @param parentId
     * @return
     */
    List<YgContentCategoryDTO> getBeanByParentId(Long parentId);
}
