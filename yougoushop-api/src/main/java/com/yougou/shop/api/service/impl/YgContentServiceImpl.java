package com.yougou.shop.api.service.impl;

import com.yougou.shop.api.dao.YgContentDao;
import com.yougou.shop.api.service.YgContentService;
import com.yougou.shop.domain.dto.YgContentCategoryDTO;
import com.yougou.shop.domain.dto.YgContentDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YgContentServiceImpl implements YgContentService {
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
}
