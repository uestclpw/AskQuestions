package com.nowcoder.async;

import java.util.List;

/**
 * 定义事件处理接口。
 */
public interface EventHandler {
    void doHandle(EventModel model);

    //注册自己，让别人知道自己是关注哪些eventType的。当这些类型的事件发生后要进行处理。
    List<EventType> getSupportEventTypes();
}
