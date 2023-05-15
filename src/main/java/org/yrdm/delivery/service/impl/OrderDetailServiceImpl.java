package org.yrdm.delivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yrdm.delivery.mapper.OrderDetailMapper;
import org.yrdm.delivery.pojo.OrderDetail;
import org.yrdm.delivery.service.OrderDetailService;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:38
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
