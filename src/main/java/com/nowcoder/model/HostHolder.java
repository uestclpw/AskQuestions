package com.nowcoder.model;

import org.springframework.stereotype.Component;

/**
 * HostHolder
 * 因为是很多个线程访问的，所以需要使用一个线程本地变量ThreadLocal。
 * 每个线程保存一个当前线程的副本。
 */
@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();;
    }
}
