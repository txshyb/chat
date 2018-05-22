package cn.txs.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 18:05
 */
@Controller
@RequestMapping("/chat")
public class ChatController {

    @RequestMapping("/toChat")
    public Object toChat(String friend, ModelAndView modelAndView) {
        modelAndView.setViewName("/chat/chat");
        modelAndView.addObject("friend",friend);
        return modelAndView;
    }
}
