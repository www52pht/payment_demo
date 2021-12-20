package com.www.payment_demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.www.payment_demo.entity.Product;
import com.www.payment_demo.mapper.ProductMapper;
import com.www.payment_demo.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
