package cn.txs.common.model;

import cn.txs.common.constant.Type;

import java.io.Serializable;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 18:25
 */
public class Message implements Serializable {
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
