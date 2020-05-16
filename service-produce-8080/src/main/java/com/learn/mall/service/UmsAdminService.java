package com.learn.mall.service;

import com.learn.mall.model.UmsAdmin;
import com.learn.mall.mapper.UmsAdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsAdminService {
    @Autowired
    private UmsAdminMapper umsAdminMapper;

    public UmsAdmin selectByPrimaryKey (Long id){
        UmsAdmin umsAdmin = umsAdminMapper.selectByPrimaryKey(id);
        return umsAdmin;
    }
}
