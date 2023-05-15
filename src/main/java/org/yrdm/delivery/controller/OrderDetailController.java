package org.yrdm.delivery.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yrdm.delivery.service.OrderDetailService;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:40
 */
@Slf4j
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;

}
