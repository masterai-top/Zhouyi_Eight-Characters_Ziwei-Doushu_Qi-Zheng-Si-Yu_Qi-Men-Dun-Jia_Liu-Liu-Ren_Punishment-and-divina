package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.WuXingConfig;

public interface WuXingConfigService {

    public int insertWuXingConfig(WuXingConfig wuXingConfig);

    public WuXingConfig selectNewWuXingConfigByUserId(Integer userId);
}
