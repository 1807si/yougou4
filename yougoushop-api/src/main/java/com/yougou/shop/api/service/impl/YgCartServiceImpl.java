package com.yougou.shop.api.service.impl;

import com.yougou.shop.api.dao.YgCartDao;
import com.yougou.shop.api.service.YgCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YgCartServiceImpl implements YgCartService {
    @Autowired
    YgCartDao ygCartDao;
    public int getCount(int id) {
        int i = ygCartDao.getCount(id);
        return i;
    }
}
