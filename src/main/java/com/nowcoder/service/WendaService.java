package com.nowcoder.service;

import org.springframework.stereotype.Service;

/**
 * IOC学习，测试使用。
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
