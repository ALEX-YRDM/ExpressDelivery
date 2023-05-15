package org.yrdm.delivery.dto;

import lombok.Data;
import org.yrdm.delivery.pojo.OrderDetail;
import org.yrdm.delivery.pojo.Orders;

import java.util.List;

/**
 * @Author: zbq
 * @Date: 2023/5/12 下午1:51
 */
@Data
public class OrdersDto extends Orders {
    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
}
