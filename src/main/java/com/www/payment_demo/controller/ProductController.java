package com.www.payment_demo.controller;

import com.www.payment_demo.entity.Product;
import com.www.payment_demo.service.ProductService;
import com.www.payment_demo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author www
 * @date 2021年12月17日 10:03
 */
@CrossOrigin //这个注解的作用是开放前端的跨域访问
@Api(tags = "商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @ApiOperation("测试接口")
    @GetMapping("/test")
    public R test() {
        return R.ok().data("message", "hello").data("now", new Date());
    }

    @GetMapping("/list")
    public R list(){
        List<Product> list = productService.list();
        return R.ok().data("productList", list);
    }

}
