package com.www.payment_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.www.payment_demo.entity.RefundInfo;
import com.www.payment_demo.mapper.RefundInfoMapper;
import com.www.payment_demo.service.RefundInfoService;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
