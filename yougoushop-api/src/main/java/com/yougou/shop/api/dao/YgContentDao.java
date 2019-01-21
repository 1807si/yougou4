package com.yougou.shop.api.dao;

import com.yougou.shop.api.web.dto.YgContentCategoryDTO;
import com.yougou.shop.api.web.dto.YgContentDTO;
import com.yougou.shop.domain.YgContent;
import com.yougou.shop.domain.YgContentCategory;

import java.util.List;

public interface YgContentDao {

    List<YgContentDTO> getBeanListByCid(YgContentCategoryDTO ygContentCategoryDTO);
}
