package cn.txs.websocket2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 14:03
 *
 * 对text信息处理
 */
//@Component
public class TextHandler extends TextWebSocketHandler {
    private final static Logger LOGGER = LoggerFactory.getLogger(TextHandler.class);
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        LOGGER.info("发送消息");
    }
}
