package cn.txs.core;

import cn.txs.common.model.TextMessage;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 18:31
 */
public class TextMessageEncoder implements Encoder.Text<TextMessage> {
    @Override
    public String encode(TextMessage textMessage) throws EncodeException {
        return null;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
