package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author: JiangH
 * @time: 2023/11/10 22:04
 */
@Mapper
public interface CommentMapper {
    List<Comment> selectCommentByEntity(int entityType,int entityId, int offset, int limit);

    int selectCountByEntity(int entityType, int entityId);


}
