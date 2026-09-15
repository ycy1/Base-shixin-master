package com.shixin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shixin.entity.Conversation;
import com.shixin.vo.ai.ConversationVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConversationMapper extends BaseMapper<Conversation> {

    IPage<ConversationVo> selectConversationVoPage(Page<Object> page, @Param("agentId") Long agentId, @Param("userId") Long userId);

    ConversationVo selectConversationVoById(@Param("id") Long id);
}
