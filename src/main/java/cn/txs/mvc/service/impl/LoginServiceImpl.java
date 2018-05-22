package cn.txs.mvc.service.impl;

import cn.txs.core.SessionCache;
import cn.txs.mvc.service.LoginService;
import cn.txs.websocket.ChatWebSocket;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 10:19
 */
@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Override
    public void login(String username, String password) {

    }
}
