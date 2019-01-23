package com.yougou.shop.api.service.impl;

import com.yougou.shop.api.dao.YgContentCategoryDao;
import com.yougou.shop.api.dao.YgContentDao;
import com.yougou.shop.api.service.YgContentService;
import com.yougou.shop.domain.YgContentCategory;
import com.yougou.shop.domain.dto.YgContentCategoryDTO;
import com.yougou.shop.domain.dto.YgContentDTO;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class YgContentServiceImpl implements YgContentService {
    @Autowired
    YgContentCategoryDao ygContentCategoryDao;
    @Autowired
    YgContentDao ygContentDao;
    public List<YgContentDTO> getBeanListByCid(YgContentCategoryDTO ygContentCategoryDTO) {
        List<YgContentDTO> ygContentDTOS = ygContentDao.getBeanListByCid(ygContentCategoryDTO);
        /*List<YgContentDTO> contentDTOS = new ArrayList<>();
        for (YgContent ygContent:ygContents) {
            YgContentDTO ygContentDTO = new YgContentDTO();
            BeanUtils.copyProperties(ygContent,ygContentDTO);//把proContent的资源赋予contentDTO
            contentDTOS.add(ygContentDTO);
        }*/
        return ygContentDTOS;
    }
    public List<YgContentDTO> getBeanListByLid( YgContentCategoryDTO ygContentCategoryDTO, int limit) {
        List<YgContentDTO> ygContentDTOS = ygContentDao.getBeanListByLid(ygContentCategoryDTO,limit);
        /*List<YgContentDTO> contentDTOS = new ArrayList<>();
        for (YgContent ygContent:ygContents) {
            YgContentDTO ygContentDTO = new YgContentDTO();
            BeanUtils.copyProperties(ygContent,ygContentDTO);//把proContent的资源赋予contentDTO
            contentDTOS.add(ygContentDTO);
        }*/
        return ygContentDTOS;
    }
    public List<YgContentDTO> search(String name) {
        boolean b = StringUtils.isBlank(name);
        List<YgContentDTO> ygContentDTOS = null;
            YgContentDTO ygContentDTO = new YgContentDTO();
            YgContentCategoryDTO ygContentCategoryDTO = new YgContentCategoryDTO();
            ygContentDTO.setName(name);
            ygContentDTO.setDesc(name);
            ygContentCategoryDTO.setName(name);
            ygContentDTO.setYgContentCategoryDTO(ygContentCategoryDTO);
            ygContentDTOS = ygContentDao.search(ygContentDTO);
        return ygContentDTOS;
    }
	public YgContentDTO getOneById(Long id) {
        YgContentDTO ygContentDTO = ygContentDao.selectOneById(id);

        return ygContentDTO;
    }

    public YgContentDTO findByPic(String pic) {
        final YgContentDTO byPic = ygContentDao.findByPic(pic);
        return  byPic;
    }

    public Map<String, List<YgContentDTO>> getIndexContent(YgContentCategoryDTO ygContentCategoryDTO) {
        //拿到一级id,根据一级id获取到二级id,根据2级id获取到产品
        //创建容器
        Map<String, List<YgContentDTO>> listMap = new HashMap<String, List<YgContentDTO>>();
        List<YgContentCategory> firstId = ygContentCategoryDao.getBeanByParentId(ygContentCategoryDTO.id);
        for (YgContentCategory ygContentCategory : firstId) {
            //根据二级id获取到三级id
            List<YgContentDTO> contentDTOS = new ArrayList<YgContentDTO>();
            List<YgContentCategory> secondId = ygContentCategoryDao.getBeanByParentId(ygContentCategory.id);
            if(secondId!=null){
                int count = 0;
                for (YgContentCategory contentCategory : secondId) {
                    //根据三级id搜索产品
                    YgContentCategoryDTO ygContentCategoryDTO1 = new YgContentCategoryDTO();
                    ygContentCategoryDTO1.setId(contentCategory.id);
                    List<YgContentDTO> thirdList = getBeanListByLid(ygContentCategoryDTO1,3);
                    for (YgContentDTO ygContentDTO : thirdList) {
                        contentDTOS.add(ygContentDTO);
                    }
                    count++;
                    if (count==2){
                        break;
                    }
                }
            }
            listMap.put("a"+ygContentCategory.id,contentDTOS);
        }
        return listMap;
    }
}
