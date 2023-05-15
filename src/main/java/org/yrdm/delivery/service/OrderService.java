package org.yrdm.delivery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.yrdm.delivery.pojo.Orders;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:35
 */
public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
