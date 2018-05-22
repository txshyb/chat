package cn.txs.mvc.controller;

import cn.txs.core.SessionCache;
import cn.txs.mvc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 10:10
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login/login";
    }

    @RequestMapping("/login")
    public Object login(String username, String password, ModelAndView modelAndView) {
        loginService.login(username,password);
        modelAndView.addObject("username",username);
        modelAndView.setViewName("login/list");
        return modelAndView;
    }

    @RequestMapping("/getList")
    @ResponseBody
    public Object getList() {
        return SessionCache.getKeys();
    }
}
