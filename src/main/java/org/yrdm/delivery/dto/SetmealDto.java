package org.yrdm.delivery.dto;

import org.yrdm.delivery.pojo.Setmeal;
import org.yrdm.delivery.pojo.SetmealDish;
import lombok.Data;
import java.util.List;
/**
 * @Author: zbq
 * @Date: 2023/5/11 下午10:40
 */
@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
