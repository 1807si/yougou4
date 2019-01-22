package com.yougou.shop.api.service.impl;

import com.yougou.shop.api.dao.YgContentCategoryDao;
import com.yougou.shop.api.service.YgContentCategoryService;
import com.yougou.shop.domain.YgContentCategory;
import com.yougou.shop.domain.dto.YgContentCategoryDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class YgContentCategoryServiceImpl implements YgContentCategoryService {
    @Autowired
    YgContentCategoryDao ygContentCategoryServiceDao;
    @Override
    public List<YgContentCategoryDTO> getBeanByParentId(Long parentId) {
        List<YgContentCategory> ygContentCategories = ygContentCategoryServiceDao.getBeanByParentId(parentId);
        List<YgContentCategoryDTO> ygContentCategoryDTOS = new ArrayList<>();
        //对获取到的数据进行封装
        for (YgContentCategory ygContentCategory : ygContentCategories) {
            YgContentCategoryDTO ygContentCategoryDTO = new YgContentCategoryDTO();
            BeanUtils.copyProperties(ygContentCategory,ygContentCategoryDTO);
            ygContentCategoryDTOS.add(ygContentCategoryDTO);
        }
        return ygContentCategoryDTOS;
    }
}
