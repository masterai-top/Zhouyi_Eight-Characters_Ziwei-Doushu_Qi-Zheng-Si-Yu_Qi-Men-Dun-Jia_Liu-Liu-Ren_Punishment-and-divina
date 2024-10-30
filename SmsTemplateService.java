package com.msld.wujibazi.service;

import com.msld.wujibazi.domain.SmsTemplate;

public interface SmsTemplateService {

    public SmsTemplate selectByCode(String code);

}
