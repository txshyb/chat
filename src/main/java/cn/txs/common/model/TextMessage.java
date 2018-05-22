package cn.txs.common.model;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 18:30
 */
public class TextMessage extends Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
