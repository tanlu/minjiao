package com.minjiao.service;

import com.minjiao.dao.CheckInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author Administrator
 * @date 2021/12/23 20:24
 * @description:
 */
@Service
public class CheckService implements BaseService {
    @Autowired
    private CheckInfoMapper checkInfoMapper;
    public int check(String username, String bookNo, String code) {
        if (username.contains("admin")&&bookNo.contains("123")){
            return 1;
        }
        return 0;
    }
}
