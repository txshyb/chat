package cn.txs.websocket;

import cn.txs.core.SessionCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 9:43
 *  tomcat8   jdk8   低的不支持
 * javax.websocket
 */
@Component
@ServerEndpoint("/chat/{username}")
public class ChatWebSocket {

    private final static Logger logger = LoggerFactory.getLogger(ChatWebSocket.class);

    @OnOpen
    public void start(@PathParam("username") String username, Session session) {
        //TODO 广播发送
        if("message".equals(username)) { //如果name为message，认为它是消息，而非登录
            logger.info("{} 登录",username);
            if(! SessionCache.containsKey(username)) {
                SessionCache.put(username,session);
            }
        }
    }

    @OnClose
    public void end(Session session) {
        try {
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 消息发送触发方法
     *
     * @param
     */
    @OnMessage
    public void incoming(String message,Session session) {
        logger.info("message|{}",message);

     //   chattingOpt.receive(message,session);
    }


    @OnError
    public void onError(Throwable t,Session session) throws Throwable {
        session.close();
    }
}
