package com.yougou.shop.api.service;

import com.yougou.shop.domain.dto.YgContentCategoryDTO;
import com.yougou.shop.domain.dto.YgContentDTO;

import java.util.List;

public interface YgContentService {
    /**
     * 根据分类id获取产品信息
     * @param ygContentCategoryDTO
     * @return
     */
    List<YgContentDTO> getBeanListByCid(YgContentCategoryDTO ygContentCategoryDTO);

    /**
     * 根据字段简单搜索
     * @param name
     * @return
     */
    List<YgContentDTO> search(String name);
}
