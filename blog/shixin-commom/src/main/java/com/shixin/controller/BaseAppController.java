package com.shixin.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.shixin.common.Constants;
import com.shixin.dto.user.LoginUserInfo;

/**
 * @author xxj
 * @title BaseAppController
 * @date 2025/9/3 16:51
 * @description TODO
 */
public class BaseAppController {

    // app 公共接口
    public LoginUserInfo getLoginUserInfo() {
        return (LoginUserInfo) StpUtil.getSession().get(Constants.CURRENT_USER);
    }

}
