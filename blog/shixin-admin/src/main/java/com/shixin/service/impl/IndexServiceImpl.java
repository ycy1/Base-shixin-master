package com.shixin.service.impl;

import com.shixin.common.RedisConstants;
import com.shixin.service.IndexService;
import com.shixin.mapper.SysUserMapper;
import com.shixin.utils.RedisUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class IndexServiceImpl implements IndexService {

    private final SysUserMapper sysUserMapper;

    private final RedisUtil redisUtil;

    @Override
    public Map<String, Object> index() {
        Map<String, Object> result = new HashMap<>();
        
        Long userCount = sysUserMapper.selectCount(null);
        result.put("userCount", userCount);

        int visitCount = 0;
        Object e = redisUtil.get(RedisConstants.BLOG_VIEWS_COUNT);
        if (e != null) {
            visitCount = Integer.parseInt(e.toString());
        }
        result.put("visitCount", visitCount);

        return result;
    }
}
