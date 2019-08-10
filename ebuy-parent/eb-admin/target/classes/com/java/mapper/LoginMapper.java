package com.java.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * description：
 * author：丁鹏
 * date：15:59
 */
public interface LoginMapper {

    /**
     * 登录
     * @param username
     * @param pwd
     * @return
     */
    @Select("SELECT COUNT(*) FROM admin_users WHERE username=#{arg0} AND pwd=#{arg1}")
    int login(String username,String pwd);

}
