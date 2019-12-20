package com.imooc.luckymonny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @Controller + @ResponseBody = @RestController
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${minMoney}")
//    private BigDecimal money;
//
//    @Value("${description}")
//    private String description;

    @Autowired
    private LimitConfig limitConfig;
    @GetMapping("/say/{id}")
    public String say(@PathVariable("id") Integer id){
        return "说明"+ limitConfig.getDescription() + id;
//        return "index";
    }
}
