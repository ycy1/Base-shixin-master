package com.shixin.service;

import com.shixin.entity.Agent;
import com.shixin.entity.Conversation;
import com.shixin.entity.Memory;

public interface ChatCommandService {

    /**
     * 执行清除上下文
     */
    String executeClear(Conversation conversation, Agent agent);

    /**
     * 导出对话为 Excel
     */
    byte[] executeExport(Conversation conversation, Integer limit);

    /**
     * 执行重新加载
     */
    String executeInit(Conversation conversation, Agent agent);
}
