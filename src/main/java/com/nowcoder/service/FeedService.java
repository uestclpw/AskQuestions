package com.nowcoder.service;

import com.nowcoder.dao.FeedDAO;
import com.nowcoder.model.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 推拉模式
 */
@Service
public class FeedService {
    @Autowired
    FeedDAO feedDAO;

    /**
     * 拉模式，直接获取关注人的新鲜事。
     */
    public List<Feed> getUserFeeds(int maxId, List<Integer> userIds, int count) {
        return feedDAO.selectUserFeeds(maxId, userIds, count);
    }

    /**
     * 发生新鲜事，增加新鲜事
     */
    public boolean addFeed(Feed feed) {
        feedDAO.addFeed(feed);
        return feed.getId() > 0;
    }

    /**
     * 推模式
     */
    public Feed getById(int id) {
        return feedDAO.getFeedById(id);
    }
}
