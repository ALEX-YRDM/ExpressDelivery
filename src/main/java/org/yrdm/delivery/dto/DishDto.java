package org.yrdm.delivery.dto;

import lombok.Data;
import org.yrdm.delivery.pojo.Dish;
import org.yrdm.delivery.pojo.DishFlavor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zbq
 * @Date: 2023/5/11 下午9:43
 */
@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;

}
