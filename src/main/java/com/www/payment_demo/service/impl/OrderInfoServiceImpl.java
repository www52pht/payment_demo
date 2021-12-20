package com.www.payment_demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.www.payment_demo.entity.OrderInfo;
import com.www.payment_demo.mapper.OrderInfoMapper;
import com.www.payment_demo.service.OrderInfoService;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
