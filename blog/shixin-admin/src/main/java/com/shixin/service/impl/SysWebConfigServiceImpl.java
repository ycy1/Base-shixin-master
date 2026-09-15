package com.shixin.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shixin.common.RedisConstants;
import com.shixin.entity.SysWebConfig;
import com.shixin.mapper.SysWebConfigMapper;
import com.shixin.service.SysWebConfigService;
import com.shixin.utils.RedisUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SysWebConfigServiceImpl extends ServiceImpl<SysWebConfigMapper, SysWebConfig> implements SysWebConfigService {

    private final RedisUtil redisUtil;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysWebConfig sysWebConfig) {
        baseMapper.updateById(sysWebConfig);
        redisUtil.set(RedisConstants.WEB_CONFIG_KEY, JSONObject.toJSONString(sysWebConfig));
    }
}
