package cn.txs.core;

import javax.websocket.Session;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tangxiaoshuang
 * @date 2018/5/22 16:26
 */
public class SessionCache {

    private static ConcurrentHashMap<String,Session> sessions = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, Session> getSessions() {
        return sessions;
    }

    public static void put(String key,Session session) {
        sessions.put(key,session);
    }

    public static boolean containsKey(String key) {
        return sessions.containsKey(key);
    }

    public static List<String> getKeys() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Session> entry : sessions.entrySet()) {
            list.add(entry.getKey());
        }
        return list;
    }
}
