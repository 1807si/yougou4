package com.yougou.shop.api.web.controller;

import com.yougou.shop.api.service.YgContentCategoryService;
import com.yougou.shop.api.service.YgContentService;
import com.yougou.shop.api.service.YgLunboService;
import com.yougou.shop.commons.dto.BaseResult;
import com.yougou.shop.domain.YgLunbo;
import com.yougou.shop.domain.dto.YgContentCategoryDTO;
import com.yougou.shop.domain.dto.YgContentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.path.v1}/indexs")
public class IndexController {
    @Autowired
    YgContentCategoryService ygContentCategoryService;
    @Autowired
    YgContentService ygContentService;
    @Autowired
    YgLunboService ygLunboService;
    BaseResult baseResult;

    /**
     * 获取轮播图
     * @return
     */
    @RequestMapping(value = "ppt",method = RequestMethod.GET)
    public BaseResult getLunbo(){
        List<YgLunbo> data = ygLunboService.getLunbo();
        baseResult = BaseResult.success(data);
        return baseResult;
    }

    /**
     * 根据分类ID获取产品
     * @param ygContentCategoryDTO
     * @return
     */
    @RequestMapping(value = "content",method = RequestMethod.GET)
    public BaseResult getContentByCid(YgContentCategoryDTO ygContentCategoryDTO){
        List<YgContentDTO> contentDTOs = ygContentService.getBeanListByCid(ygContentCategoryDTO);
        baseResult = BaseResult.success(contentDTOs);
        return baseResult;
    }

    /**
     * 根据字段搜索
     * @param
     * @return
     */
    @RequestMapping(value = "search",method = RequestMethod.GET)
    public BaseResult search(String name){
        //String name = (String) request.getAttribute("name");
        List<YgContentDTO> contentDTOs = ygContentService.search(name);
        if (contentDTOs==null){
            baseResult = BaseResult.fail("你查询的结果不存在");
        }else {
            baseResult = BaseResult.success(contentDTOs);
        }
        return baseResult;
    }

    /**
     * 获取父分类
     * @return
     */
    @RequestMapping(value = "pCategory",method = RequestMethod.GET)
    public BaseResult getPcategory(){
        List<YgContentCategoryDTO> data = ygContentCategoryService.getBeanByParentId(1L);
        baseResult = BaseResult.success(data);
        return baseResult;
    }

    /**
     * 获取子分类
     * @param id
     * @return
     */
    @RequestMapping(value = "cCategory",method = RequestMethod.GET)
    public BaseResult getCcategory(Long id){
        List<YgContentCategoryDTO> data = ygContentCategoryService.getBeanByParentId(id);
        baseResult = BaseResult.success(data);
        return baseResult;
    }
}
