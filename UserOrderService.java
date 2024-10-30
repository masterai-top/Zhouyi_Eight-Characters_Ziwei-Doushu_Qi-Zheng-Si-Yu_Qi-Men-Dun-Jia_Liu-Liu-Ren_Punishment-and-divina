package com.msld.wujibazi.service;

import com.alipay.api.AlipayApiException;

import javax.servlet.http.HttpServletRequest;

public interface UserOrderService {

    public String pay(Integer userId) throws AlipayApiException;


    public String notifyNotice(HttpServletRequest request) throws AlipayApiException;

}
