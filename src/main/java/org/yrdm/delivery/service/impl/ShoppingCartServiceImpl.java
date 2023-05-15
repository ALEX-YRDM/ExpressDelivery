package org.yrdm.delivery.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.yrdm.delivery.mapper.ShoppingCartMapper;
import org.yrdm.delivery.pojo.ShoppingCart;
import org.yrdm.delivery.service.ShoppingCartService;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:39
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
