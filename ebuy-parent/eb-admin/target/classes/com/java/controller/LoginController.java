package com.java.controller;

import com.java.service.LoginService;
import com.java.utils.MD5Too;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description：
 * author：丁鹏
 * date：15:43
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param username
     * @param pwd
     * @return
     */
    @RequestMapping("/login.do")
    public  String login(String username,String pwd) throws Exception{//NULL
        System.out.println("username="+username+",pwd="+pwd);
        //没有做任何的校验
        if(username==null || pwd==null){
            return "login";
        }
        boolean flag1 = username.matches(".{3,12}");
        boolean flag2 = pwd.matches(".{6,12}");
        if(!flag1 || !flag2){
            return "login";
        }
        //没有对密码进行加密
        pwd = MD5Too.MD5(pwd);
        boolean flag = loginService.login(username, pwd);
        return flag?"index":"login";
    }

}
