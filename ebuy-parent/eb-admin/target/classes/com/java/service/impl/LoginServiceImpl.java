package com.java.service.impl;

import com.java.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description：
 * author：丁鹏
 * date：16:01
 */
@Service
public class LoginServiceImpl implements com.java.service.LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public boolean login(String username, String pwd){
        return loginMapper.login(username,pwd)>=1;
    }

}
