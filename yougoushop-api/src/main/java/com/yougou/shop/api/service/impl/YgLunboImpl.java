package com.yougou.shop.api.service.impl;

import com.yougou.shop.api.dao.YgLunboDao;
import com.yougou.shop.api.service.YgLunboService;
import com.yougou.shop.domain.YgLunbo;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YgLunboImpl implements YgLunboService {
    @Autowired
    YgLunboDao ygLunboDao;
    public List<YgLunbo> getLunbo() {
        return ygLunboDao.getLunbo();
    }
}
