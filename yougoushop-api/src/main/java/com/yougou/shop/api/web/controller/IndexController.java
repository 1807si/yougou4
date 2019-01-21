package com.yougou.shop.api.web.controller;

import com.yougou.shop.api.service.YgContentService;
import com.yougou.shop.api.service.YgLunboService;
import com.yougou.shop.api.web.dto.YgContentCategoryDTO;
import com.yougou.shop.api.web.dto.YgContentDTO;
import com.yougou.shop.api.web.dto.YgLunbo;
import com.yougou.shop.commons.dto.BaseResult;
import com.yougou.shop.domain.YgContentCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.path.v1}/indexs")
public class IndexController {
    @Autowired
    YgContentService ygContentService;
    @Autowired
    YgLunboService ygLunboService;
    BaseResult baseResult;
    @RequestMapping(value = "ppt",method = RequestMethod.GET)
    public BaseResult getLunbo(){
        List<YgLunbo> data = ygLunboService.getLunbo();
        baseResult = BaseResult.success(data);
        return baseResult;
    }

    @RequestMapping(value = "content",method = RequestMethod.GET)
    public BaseResult getContentByCid(YgContentCategoryDTO ygContentCategoryDTO){
        List<YgContentDTO> contentDTOs = ygContentService.getBeanListByCid(ygContentCategoryDTO);
        baseResult = BaseResult.success(contentDTOs);
        return baseResult;
    }
}
