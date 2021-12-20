package com.www.payment_demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.www.payment_demo.entity.PaymentInfo;
import com.www.payment_demo.mapper.PaymentInfoMapper;
import com.www.payment_demo.service.PaymentInfoService;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
