package com.yougou.shop.api.service;

import com.yougou.shop.api.web.dto.YgContentCategoryDTO;
import com.yougou.shop.api.web.dto.YgContentDTO;
import com.yougou.shop.domain.YgContent;
import com.yougou.shop.domain.YgContentCategory;

import java.util.List;

public interface YgContentService {
    List<YgContentDTO> getBeanListByCid(YgContentCategoryDTO ygContentCategoryDTO);
}
