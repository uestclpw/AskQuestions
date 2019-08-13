package com.nowcoder.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 把任何的数据放在一起。以便返回给前端。对象和Velocity中间的一个对象。
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap<String, Object>();
    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
