package com.yougou.shop.api.dao;

import com.yougou.shop.api.web.dto.YgContentCategoryDTO;
import com.yougou.shop.api.web.dto.YgContentDTO;
import com.yougou.shop.domain.YgContent;
import com.yougou.shop.domain.YgContentCategory;

import java.util.List;

public interface YgContentDao {
    /**
     * 根据分类id获取产品信息
     * @param ygContentCategoryDTO
     * @return
     */
    List<YgContentDTO> getBeanListByCid(YgContentCategoryDTO ygContentCategoryDTO);
    /**
     * 根据字段简单搜索
     * @param ygContentDTO
     * @return
     */
    List<YgContentDTO> search(YgContentDTO ygContentDTO);
}
